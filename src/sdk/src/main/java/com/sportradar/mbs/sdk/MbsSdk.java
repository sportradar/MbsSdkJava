package com.sportradar.mbs.sdk;

import com.sportradar.mbs.sdk.exceptions.SdkException;
import com.sportradar.mbs.sdk.exceptions.SdkNotConnectedException;
import com.sportradar.mbs.sdk.internal.config.ImmutableConfig;
import com.sportradar.mbs.sdk.internal.protocol.ProtocolEngine;
import com.sportradar.mbs.sdk.internal.protocol.ProtocolProviderImpl;
import com.sportradar.mbs.sdk.internal.utils.ExcSuppress;
import com.sportradar.mbs.sdk.protocol.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;

/**
 * The MbsSdk class represents the main entry point for interacting with the MBS SDK. It provides methods for connecting
 * to the MBS server, retrieving the ticket protocol, and closing the SDK.
 */
public class MbsSdk implements ProtocolProvider, AutoCloseable {

    private final Object lock;
    private final ImmutableConfig config;
    private final ProtocolEngine engine;
    private final ProtocolProvider defaultProtocolProvider;
    private final ConcurrentMap<Long, ProtocolProvider> protocolProviders;
    private final BiConsumer<MbsSdk, Exception> unhandledExceptionHandler;

    private boolean connected = false;
    private boolean closed = false;

    /**
     * Constructs a new instance of the MbsSdk class with the specified configuration.
     *
     * @param config The configuration for the MBS SDK.
     */
    public MbsSdk(final MbsSdkConfig config) {
        this.config = new ImmutableConfig(config);
        this.unhandledExceptionHandler = config.getUnhandledExceptionHandler();
        this.engine = new ProtocolEngine(this.config, this::handleException);
        this.protocolProviders = new ConcurrentHashMap<>();
        this.defaultProtocolProvider = this.getProtocolProvider(config.getOperatorId());
        this.lock = new Object();
    }

    /**
     * Gets the ticket protocol for interacting with the MBS server.
     *
     * @return The ticket protocol.
     */
    @Override
    public TicketProtocol getTicketProtocol() {
        return this.defaultProtocolProvider.getTicketProtocol();
    }

    /**
     * Gets the account protocol for interacting with the MBS server.
     *
     * @return The account protocol.
     */
    @Override
    public AccountProtocol getAccountProtocol() {
        return this.defaultProtocolProvider.getAccountProtocol();
    }

    /**
     * Gets the balance protocol for interacting with the MBS server.
     *
     * @return The balance protocol.
     */
    @Override
    public BalanceProtocol getBalanceProtocol() {
        return this.defaultProtocolProvider.getBalanceProtocol();
    }

    /**
     * Gets the gaming protocol for interacting with the MBS server.
     *
     * @return The gaming protocol.
     */
    @Override
    public GamingProtocol getGamingProtocol() {
        return this.defaultProtocolProvider.getGamingProtocol();
    }

    /**
     * Gets the protocol provider for the specified operator ID.
     *
     * @param operatorId The operator ID.
     * @return The protocol provider for the specified operator ID.
     */
    public ProtocolProvider getProtocolProvider(final long operatorId) {
        final ProtocolProvider provider = this.protocolProviders.get(operatorId);
        return provider != null
                ? provider
                : this.protocolProviders.computeIfAbsent(operatorId, id -> new ProtocolProviderImpl(id, this.engine));
    }

    /**
     * Connects the SDK to the MBS server. If the SDK is already connected, this method does nothing.
     *
     * @throws SdkException If an error occurs during the connection process.
     */
    public void connect() {
        try {
            synchronized (this.lock) {
                if (this.closed) throw new RuntimeException("MbsSdk is closed.");
                if (this.connected) return;
                this.engine.connect();
                this.connected = true;
            }
        } catch (final SdkException sdkException) {
            throw sdkException;
        } catch (final Exception exception) {
            throw new SdkNotConnectedException(exception);
        }
    }

    /**
     * Closes the SDK and releases any resources associated with it. If the SDK is already closed, this method does
     * nothing.
     */
    @Override
    public void close() {
        synchronized (this.lock) {
            if (this.closed) return;
            this.connected = false;
            ExcSuppress.close(this.engine);
            this.closed = true;
        }
    }

    /**
     * Handles the exception by invoking the unhandled exception handler, if available.
     *
     * @param exception The exception to handle.
     */
    private void handleException(final Exception exception) {
        final BiConsumer<MbsSdk, Exception> handler = unhandledExceptionHandler;
        if (handler == null) {
            return;
        }
        try {
            handler.accept(this, exception);
        } catch (final Exception ignored) {
        }
    }
}

package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.MbsSdkConfig;
import com.sportradar.mbs.sdk.internal.config.ImmutableConfig;
import com.sportradar.mbs.sdk.internal.utils.ExcSuppress;
import com.sportradar.mbs.sdk.protocol.AccountProtocol;
import com.sportradar.mbs.sdk.protocol.BalanceProtocol;
import com.sportradar.mbs.sdk.protocol.GamingProtocol;
import com.sportradar.mbs.sdk.protocol.TicketProtocol;

import java.util.function.Consumer;

public class ProtocolProvider implements AutoCloseable {

    private final ProtocolEngine engine;
    private final TicketProtocol ticketProtocol;
    private final AccountProtocol accountProtocol;
    private final BalanceProtocol balanceProtocol;
    private final GamingProtocol gamingProtocol;

    public ProtocolProvider(final MbsSdkConfig sdkConfig, final Consumer<Exception> unhandledExceptionHandler) {
        final ImmutableConfig config = new ImmutableConfig(sdkConfig);
        this.engine = new ProtocolEngine(config, unhandledExceptionHandler);
        this.ticketProtocol = new TicketProtocolImpl(this.engine);
        this.accountProtocol = new AccountProtocolImpl(this.engine);
        this.balanceProtocol = new BalanceProtocolImpl(this.engine);
        this.gamingProtocol = new GamingProtocolImpl(this.engine);
    }

    public TicketProtocol getTicketProtocol() {
        return ticketProtocol;
    }

    public AccountProtocol getAccountProtocol() {
        return accountProtocol;
    }

    public BalanceProtocol getBalanceProtocol() {
        return balanceProtocol;
    }

    public GamingProtocol getGamingProtocol() {
        return gamingProtocol;
    }

    public void connect() {
        this.engine.connect();
    }

    @Override
    public void close() {
        ExcSuppress.close(this.engine);
    }
}

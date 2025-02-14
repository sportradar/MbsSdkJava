package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountStatusInformRequest;
import com.sportradar.mbs.sdk.entities.request.FinancialLimitInformRequest;
import com.sportradar.mbs.sdk.entities.request.LimitReachedInformRequest;
import com.sportradar.mbs.sdk.entities.request.SessionLimitInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountStatusInformResponse;
import com.sportradar.mbs.sdk.entities.response.FinancialLimitInformResponse;
import com.sportradar.mbs.sdk.entities.response.LimitReachedInformResponse;
import com.sportradar.mbs.sdk.entities.response.SessionLimitInformResponse;
import com.sportradar.mbs.sdk.protocol.AccountProtocol;

import java.util.concurrent.CompletableFuture;

/**
 * Implementation of the {@link AccountProtocol} interface.
 * Handles communication with the protocol engine to process various account-related requests asynchronously.
 */
public class AccountProtocolImpl implements AccountProtocol {

    /**
     * The protocol engine responsible for executing requests.
     */
    private final ProtocolEngine engine;

    /**
     * Constructs an instance of {@code AccountProtocolImpl} with the specified protocol engine.
     *
     * @param engine The protocol engine used for executing requests.
     */
    public AccountProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    /**
     * Sends an asynchronous request to retrieve account status information.
     *
     * @param request The request object containing account status details.
     * @return A {@code CompletableFuture} representing the account status response.
     */
    @Override
    public CompletableFuture<AccountStatusInformResponse> sendAccountStatusAsync(final AccountStatusInformRequest request) {
        return engine.execute("account-status-inform", request, AccountStatusInformResponse.class);
    }

    /**
     * Sends an asynchronous request to inform about a financial limit.
     *
     * @param request The request object containing financial limit details.
     * @return A {@code CompletableFuture} representing the financial limit inform response.
     */
    @Override
    public CompletableFuture<FinancialLimitInformResponse> sendFinancialLimitInformAsync(final FinancialLimitInformRequest request) {
        return engine.execute("financial-limit-inform", request, FinancialLimitInformResponse.class);
    }

    /**
     * Sends an asynchronous request to inform that a limit has been reached.
     *
     * @param request The request object indicating a limit has been reached.
     * @return A {@code CompletableFuture} representing the limit reached inform response.
     */
    @Override
    public CompletableFuture<LimitReachedInformResponse> sendLimitReachedInformAsync(final LimitReachedInformRequest request) {
        return engine.execute("limit-reached-inform", request, LimitReachedInformResponse.class);
    }

    /**
     * Sends an asynchronous request to inform about a session limit.
     *
     * @param request The request object containing session limit details.
     * @return A {@code CompletableFuture} representing the session limit inform response.
     */
    @Override
    public CompletableFuture<SessionLimitInformResponse> sendSessionLimitInformAsync(final SessionLimitInformRequest request) {
        return engine.execute("session-limit-inform", request, SessionLimitInformResponse.class);
    }
}

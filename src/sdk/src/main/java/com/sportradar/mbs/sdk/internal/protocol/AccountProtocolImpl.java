package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountInterventionInformRequest;
import com.sportradar.mbs.sdk.entities.request.AccountLimitInformRequest;
import com.sportradar.mbs.sdk.entities.request.AccountLimitReachedInformRequest;
import com.sportradar.mbs.sdk.entities.request.AccountStatusInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountInterventionInformResponse;
import com.sportradar.mbs.sdk.entities.response.AccountLimitInformResponse;
import com.sportradar.mbs.sdk.entities.response.AccountLimitReachedInformResponse;
import com.sportradar.mbs.sdk.entities.response.AccountStatusInformResponse;
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
     * Sends an account status inform request asynchronously.
     *
     * @param request The request object containing account details.
     * @return A CompletableFuture representing the account status response.
     */
    @Override
    public CompletableFuture<AccountStatusInformResponse> sendStatusInformAsync(
            AccountStatusInformRequest request) {
        return engine.execute("account-status-inform", request, AccountStatusInformResponse.class);
    }

    /**
     * Sends a limit inform request asynchronously.
     *
     * @param request The request object containing limit details.
     * @return A CompletableFuture representing the limit inform response.
     */
    @Override
    public CompletableFuture<AccountLimitInformResponse> sendLimitInformAsync(
            AccountLimitInformRequest request) {
        return engine.execute("account-limit-inform", request, AccountLimitInformResponse.class);
    }

    /**
     * Sends a limit reached inform request asynchronously.
     *
     * @param request The request object indicating a limit has been reached.
     * @return A CompletableFuture representing the limit reached inform response.
     */
    @Override
    public CompletableFuture<AccountLimitReachedInformResponse> sendLimitReachedInformAsync(
            AccountLimitReachedInformRequest request) {
        return engine.execute("account-limit-reached-inform", request, AccountLimitReachedInformResponse.class);
    }

    /**
     * Sends an intervention inform request asynchronously.
     *
     * @param request The request object containing intervention details.
     * @return A CompletableFuture representing the intervention inform response.
     */
    @Override
    public CompletableFuture<AccountInterventionInformResponse> sendInterventionInformAsync(
            AccountInterventionInformRequest request) {
        return engine.execute("account-intervention-inform", request, AccountInterventionInformResponse.class);
    }
}

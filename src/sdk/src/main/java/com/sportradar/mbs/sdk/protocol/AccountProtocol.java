package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.*;
import com.sportradar.mbs.sdk.entities.response.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Interface defining the account-related communication protocol.
 * Provides synchronous and asynchronous methods for handling various account-related requests.
 */
public interface AccountProtocol {

    /**
     * Sends an account status inform request synchronously.
     * Calls the asynchronous method and waits for the result.
     *
     * @param request The request object containing account details.
     * @return The account status response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default AccountStatusInformResponse sendAccountStatusInform(AccountStatusInformRequest request) throws ExecutionException, InterruptedException {
        return this.sendAccountStatusAsync(request).get();
    }

    /**
     * Sends a financial limit inform request synchronously.
     * Calls the asynchronous method and waits for the result.
     *
     * @param request The request object containing financial limit details.
     * @return The financial limit inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default FinancialLimitInformResponse sendFinancialLimitInform(FinancialLimitInformRequest request) throws ExecutionException, InterruptedException {
        return this.sendFinancialLimitInformAsync(request).get();
    }

    /**
     * Sends a limit reached inform request synchronously.
     * Calls the asynchronous method and waits for the result.
     *
     * @param request The request object indicating a limit has been reached.
     * @return The limit reached inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default LimitReachedInformResponse sendLimitReachedInform(LimitReachedInformRequest request) throws ExecutionException, InterruptedException {
        return this.sendLimitReachedInformAsync(request).get();
    }

    /**
     * Sends a session limit inform request synchronously.
     * Calls the asynchronous method and waits for the result.
     *
     * @param request The request object containing session limit details.
     * @return The session limit inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default SessionLimitInformResponse sendSessionLimitInform(SessionLimitInformRequest request) throws ExecutionException, InterruptedException {
        return this.sendSessionLimitInformAsync(request).get();
    }

    default InterventionInformResponse sendInterventionInform(InterventionInformRequest request) throws ExecutionException, InterruptedException {
        return this.InterventionInformAsync(request).get();
    }

    /**
     * Sends an account status inform request asynchronously.
     *
     * @param request The request object containing account details.
     * @return A CompletableFuture representing the account status response.
     */
    CompletableFuture<AccountStatusInformResponse> sendAccountStatusAsync(AccountStatusInformRequest request);

    /**
     * Sends a financial limit inform request asynchronously.
     *
     * @param request The request object containing financial limit details.
     * @return A CompletableFuture representing the financial limit inform response.
     */
    CompletableFuture<FinancialLimitInformResponse> sendFinancialLimitInformAsync(FinancialLimitInformRequest request);

    /**
     * Sends a limit reached inform request asynchronously.
     *
     * @param request The request object indicating a limit has been reached.
     * @return A CompletableFuture representing the limit reached inform response.
     */
    CompletableFuture<LimitReachedInformResponse> sendLimitReachedInformAsync(LimitReachedInformRequest request);

    /**
     * Sends a session limit inform request asynchronously.
     *
     * @param request The request object containing session limit details.
     * @return A CompletableFuture representing the session limit inform response.
     */
    CompletableFuture<SessionLimitInformResponse> sendSessionLimitInformAsync(SessionLimitInformRequest request);

    CompletableFuture<InterventionInformResponse> InterventionInformAsync(InterventionInformRequest request);

}

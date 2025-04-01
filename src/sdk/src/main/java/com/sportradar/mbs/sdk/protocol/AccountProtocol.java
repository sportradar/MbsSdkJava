package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountInterventionInformRequest;
import com.sportradar.mbs.sdk.entities.request.AccountLimitInformRequest;
import com.sportradar.mbs.sdk.entities.request.AccountLimitReachedInformRequest;
import com.sportradar.mbs.sdk.entities.request.AccountStatusInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountInterventionInformResponse;
import com.sportradar.mbs.sdk.entities.response.AccountLimitInformResponse;
import com.sportradar.mbs.sdk.entities.response.AccountLimitReachedInformResponse;
import com.sportradar.mbs.sdk.entities.response.AccountStatusInformResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Interface defining the account-related communication protocol.
 * Provides synchronous and asynchronous methods for handling various account-related requests.
 */
public interface AccountProtocol {

    /**
     * Sends a status inform request synchronously.
     *
     * @param request The request object containing status details.
     * @return The status inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default AccountStatusInformResponse sendStatusInform(AccountStatusInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendStatusInformAsync(request).get();
    }

    /**
     * Sends a limit inform request synchronously.
     *
     * @param request The request object containing limit details.
     * @return The limit inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default AccountLimitInformResponse sendLimitInform(AccountLimitInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendLimitInformAsync(request).get();
    }

    /**
     * Sends a limit reached inform request synchronously.
     *
     * @param request The request object containing limit reached details.
     * @return The limit reached inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default AccountLimitReachedInformResponse sendLimitReachedInform(AccountLimitReachedInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendLimitReachedInformAsync(request).get();
    }

    /**
     * Sends a session limit inform request.
     *
     * @param request The request object containing session limit details.
     * @return An intervention inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default AccountInterventionInformResponse sendInterventionInform(AccountInterventionInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendInterventionInformAsync(request).get();
    }

    /**
     * Sends an account status inform request asynchronously.
     *
     * @param request The request object containing account details.
     * @return A CompletableFuture representing the account status response.
     */
    CompletableFuture<AccountStatusInformResponse> sendStatusInformAsync(
            AccountStatusInformRequest request);

    /**
     * Sends a limit inform request asynchronously.
     *
     * @param request The request object containing limit details.
     * @return A CompletableFuture representing the limit inform response.
     */
    CompletableFuture<AccountLimitInformResponse> sendLimitInformAsync(
            AccountLimitInformRequest request);

    /**
     * Sends a limit reached inform request asynchronously.
     *
     * @param request The request object indicating a limit has been reached.
     * @return A CompletableFuture representing the limit reached inform response.
     */
    CompletableFuture<AccountLimitReachedInformResponse> sendLimitReachedInformAsync(
            AccountLimitReachedInformRequest request);

    /**
     * Sends an intervention inform request asynchronously.
     *
     * @param request The request object containing intervention details.
     * @return A CompletableFuture representing the intervention inform response.
     */
    CompletableFuture<AccountInterventionInformResponse> sendInterventionInformAsync(
            AccountInterventionInformRequest request);
}

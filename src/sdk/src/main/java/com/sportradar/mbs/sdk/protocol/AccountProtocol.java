package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountStatusInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountStatusInformResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Interface defining the account-related communication protocol.
 * Provides synchronous and asynchronous methods for retrieving account status.
 */
public interface AccountProtocol {

    /**
     * Retrieves the account status synchronously.
     * Calls the asynchronous method and waits for the result.
     *
     * @param request The request object containing account details.
     * @return The account status response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default AccountStatusInformResponse sendAccountStatus(AccountStatusInformRequest request) throws ExecutionException, InterruptedException {
        return this.sendAccountStatusAsync(request).get();
    }

    /**
     * Retrieves the account status asynchronously.
     *
     * @param request The request object containing account details.
     * @return A CompletableFuture representing the account status response.
     */
    CompletableFuture<AccountStatusInformResponse> sendAccountStatusAsync(AccountStatusInformRequest request);
}

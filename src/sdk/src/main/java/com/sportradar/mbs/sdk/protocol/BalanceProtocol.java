package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.*;
import com.sportradar.mbs.sdk.entities.response.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Interface defining the balance-related communication protocol. Provides synchronous and asynchronous methods for
 * handling various balance-related requests.
 */
public interface BalanceProtocol {

    /**
     * Sends a deposit inform request asynchronously.
     *
     * @param request The request object containing deposit details.
     * @return The deposit inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default DepositInformResponse sendDepositInform(DepositInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendDepositInformAsync(request).get();
    }

    /**
     * Sends a withdrawal inform request asynchronously.
     *
     * @param request The request object containing withdrawal details.
     * @return The withdrawal inform response.
     * @throws ExecutionException   If the computation threw an exception.
     * @throws InterruptedException If the current thread was interrupted while waiting.
     */
    default WithdrawalInformResponse sendWithdrawalInform(WithdrawalInformRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendWithdrawalInformAsync(request).get();
    }

    /**
     * Sends a deposit inform request asynchronously.
     *
     * @param request The request object containing deposit details.
     * @return A CompletableFuture representing the deposit inform response.
     */
    CompletableFuture<DepositInformResponse> sendDepositInformAsync(
            DepositInformRequest request);

    /**
     * Sends a withdrawal inform request asynchronously.
     *
     * @param request The request object containing withdrawal details.
     * @return A CompletableFuture representing the withdrawal inform response.
     */
    CompletableFuture<WithdrawalInformResponse> sendWithdrawalInformAsync(
            WithdrawalInformRequest request);
}

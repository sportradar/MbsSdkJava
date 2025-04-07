package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.DepositInformRequest;
import com.sportradar.mbs.sdk.entities.request.WithdrawalInformRequest;
import com.sportradar.mbs.sdk.entities.response.DepositInformResponse;
import com.sportradar.mbs.sdk.entities.response.WithdrawalInformResponse;
import com.sportradar.mbs.sdk.protocol.BalanceProtocol;

import java.util.concurrent.CompletableFuture;

/**
 * Implementation of the {@link BalanceProtocol} interface. Handles communication with the protocol engine to process
 * various account-related requests asynchronously.
 */
public class BalanceProtocolImpl implements BalanceProtocol {

    /**
     * The protocol engine responsible for executing requests.
     */
    private final ProtocolEngine engine;

    /**
     * Constructs an instance of {@code AccountProtocolImpl} with the specified protocol engine.
     *
     * @param engine The protocol engine used for executing requests.
     */
    public BalanceProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    /**
     * Sends a deposit inform request asynchronously.
     *
     * @param request The request object containing deposit details.
     * @return A CompletableFuture representing the deposit inform response.
     */
    @Override
    public CompletableFuture<DepositInformResponse> sendDepositInformAsync(DepositInformRequest request) {
        return engine.execute("balance-deposit-inform", request, DepositInformResponse.class);
    }

    /**
     * Sends a withdrawal inform request asynchronously.
     *
     * @param request The request object containing withdrawal details.
     * @return A CompletableFuture representing the withdrawal inform response.
     */
    @Override
    public CompletableFuture<WithdrawalInformResponse> sendWithdrawalInformAsync(WithdrawalInformRequest request) {
        return engine.execute("balance-withdrawal-inform", request, WithdrawalInformResponse.class);
    }
}

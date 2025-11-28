package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.*;
import com.sportradar.mbs.sdk.entities.response.*;
import com.sportradar.mbs.sdk.protocol.TicketProtocol;

import java.util.concurrent.CompletableFuture;

class TicketProtocolImpl implements TicketProtocol {

    /**
     * The operator identifier.
     */
    private final long operatorId;
    private final ProtocolEngine engine;

    public TicketProtocolImpl(final long operatorId, final ProtocolEngine engine) {
        this.operatorId = operatorId;
        this.engine = engine;
    }

    @Override
    public CompletableFuture<TicketResponse> sendTicketAsync(final TicketRequest request) {
        return engine.execute(this.operatorId, "ticket-placement", request, TicketResponse.class);
    }

    @Override
    public CompletableFuture<TicketInformResponse> sendTicketInformAsync(final TicketInformRequest request) {
        return engine.execute(this.operatorId, "ticket-placement-inform", request, TicketInformResponse.class);
    }

    @Override
    public CompletableFuture<TicketAckResponse> sendTicketAckAsync(final TicketAckRequest request) {
        return engine.execute(this.operatorId, "ticket-placement-ack", request, TicketAckResponse.class);
    }

    @Override
    public CompletableFuture<CancelResponse> sendCancelAsync(final CancelRequest request) {
        return engine.execute(this.operatorId, "ticket-cancel", request, CancelResponse.class);
    }

    @Override
    public CompletableFuture<CancelAckResponse> sendCancelAckAsync(final CancelAckRequest request) {
        return engine.execute(this.operatorId, "ticket-cancel-ack", request, CancelAckResponse.class);
    }

    @Override
    public CompletableFuture<CashoutResponse> sendCashoutAsync(final CashoutRequest request) {
        return engine.execute(this.operatorId, "ticket-cashout", request, CashoutResponse.class);
    }

    @Override
    public CompletableFuture<CashoutInformResponse> sendCashoutInformAsync(final CashoutInformRequest request) {
        return engine.execute(this.operatorId, "cashout-inform", request, CashoutInformResponse.class);
    }

    @Override
    public CompletableFuture<CashoutBuildResponse> sendCashoutBuildAsync(final CashoutBuildRequest request) {
        return engine.execute(this.operatorId, "cashout-build", request, CashoutBuildResponse.class);
    }

    @Override
    public CompletableFuture<CashoutAckResponse> sendCashoutAckAsync(final CashoutAckRequest request) {
        return engine.execute(this.operatorId, "ticket-cashout-ack", request, CashoutAckResponse.class);
    }

    @Override
    public CompletableFuture<ExtSettlementResponse> sendExtSettlementAsync(final ExtSettlementRequest request) {
        return engine.execute(this.operatorId, "ticket-ext-settlement", request, ExtSettlementResponse.class);
    }

    @Override
    public CompletableFuture<ExtSettlementAckResponse> sendExtSettlementAckAsync(final ExtSettlementAckRequest request) {
        return engine.execute(this.operatorId, "ticket-ext-settlement-ack", request, ExtSettlementAckResponse.class);
    }

    @Override
    public CompletableFuture<MaxStakeResponse> sendMaxStakeAsync(MaxStakeRequest request) {
        return engine.execute(this.operatorId, "max-stake", request, MaxStakeResponse.class);
    }

    @Override
    public CompletableFuture<CashoutPlacementResponse> sendCashoutPlacementAsync(CashoutPlacementRequest request) {
        return engine.execute(this.operatorId, "cashout-placement", request, CashoutPlacementResponse.class);
    }

    @Override
    public CompletableFuture<PayoutModifierSettlementResponse> sendPayoutModifierSettlementAsync(PayoutModifierSettlementRequest request) {
        return engine.execute(this.operatorId, "payout-modifier-settlement", request, PayoutModifierSettlementResponse.class);
    }
}

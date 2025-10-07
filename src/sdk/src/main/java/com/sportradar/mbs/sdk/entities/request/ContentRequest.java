package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AccountInterventionInformRequest.class, name = "account-intervention-inform"),
        @JsonSubTypes.Type(value = AccountLimitInformRequest.class, name = "account-limit-inform"),
        @JsonSubTypes.Type(value = AccountLimitReachedInformRequest.class, name = "account-limit-reached-inform"),
        @JsonSubTypes.Type(value = AccountStatusInformRequest.class, name = "account-status-inform"),
        @JsonSubTypes.Type(value = BalanceChangeInformRequest.class, name = "balance-change-inform"),
        @JsonSubTypes.Type(value = CancelRequest.class, name = "cancel"),
        @JsonSubTypes.Type(value = CancelAckRequest.class, name = "cancel-ack"),
        @JsonSubTypes.Type(value = CashoutRequest.class, name = "cashout"),
        @JsonSubTypes.Type(value = CashoutAckRequest.class, name = "cashout-ack"),
        @JsonSubTypes.Type(value = CashoutBuildRequest.class, name = "cashout-build"),
        @JsonSubTypes.Type(value = CashoutInformRequest.class, name = "cashout-inform"),
        @JsonSubTypes.Type(value = CashoutPlacementRequest.class, name = "cashout-placement"),
        @JsonSubTypes.Type(value = CasinoSessionsRequest.class, name = "casino-sessions-inform"),
        @JsonSubTypes.Type(value = DepositInformRequest.class, name = "deposit-inform"),
        @JsonSubTypes.Type(value = ExtSettlementRequest.class, name = "ext-settlement"),
        @JsonSubTypes.Type(value = ExtSettlementAckRequest.class, name = "ext-settlement-ack"),
        @JsonSubTypes.Type(value = MaxStakeRequest.class, name = "max-stake"),
        @JsonSubTypes.Type(value = PayoutModifierSettlementRequest.class, name = "payout-modifier-settlement"),
        @JsonSubTypes.Type(value = TicketRequest.class, name = "ticket"),
        @JsonSubTypes.Type(value = TicketAckRequest.class, name = "ticket-ack"),
        @JsonSubTypes.Type(value = TicketBuildRequest.class, name = "ticket-build"),
        @JsonSubTypes.Type(value = TicketInformRequest.class, name = "ticket-inform"),
        @JsonSubTypes.Type(value = WithdrawalInformRequest.class, name = "withdrawal-inform")
})
public abstract class ContentRequest {


    public static AccountInterventionInformRequest.Builder newAccountInterventionInformRequestBuilder() {
        return AccountInterventionInformRequest.newBuilder();
    }

    public static AccountLimitInformRequest.Builder newAccountLimitInformRequestBuilder() {
        return AccountLimitInformRequest.newBuilder();
    }

    public static AccountLimitReachedInformRequest.Builder newAccountLimitReachedInformRequestBuilder() {
        return AccountLimitReachedInformRequest.newBuilder();
    }

    public static AccountStatusInformRequest.Builder newAccountStatusInformRequestBuilder() {
        return AccountStatusInformRequest.newBuilder();
    }

    public static BalanceChangeInformRequest.Builder newBalanceChangeInformRequestBuilder() {
        return BalanceChangeInformRequest.newBuilder();
    }

    public static CancelRequest.Builder newCancelRequestBuilder() {
        return CancelRequest.newBuilder();
    }

    public static CancelAckRequest.Builder newCancelAckRequestBuilder() {
        return CancelAckRequest.newBuilder();
    }

    public static CashoutRequest.Builder newCashoutRequestBuilder() {
        return CashoutRequest.newBuilder();
    }

    public static CashoutAckRequest.Builder newCashoutAckRequestBuilder() {
        return CashoutAckRequest.newBuilder();
    }

    public static CashoutBuildRequest.Builder newCashoutBuildRequestBuilder() {
        return CashoutBuildRequest.newBuilder();
    }

    public static CashoutInformRequest.Builder newCashoutInformRequestBuilder() {
        return CashoutInformRequest.newBuilder();
    }

    public static CashoutPlacementRequest.Builder newCashoutPlacementRequestBuilder() {
        return CashoutPlacementRequest.newBuilder();
    }

    public static CasinoSessionsRequest.Builder newCasinoSessionsRequestBuilder() {
        return CasinoSessionsRequest.newBuilder();
    }

    public static DepositInformRequest.Builder newDepositInformRequestBuilder() {
        return DepositInformRequest.newBuilder();
    }

    public static ExtSettlementRequest.Builder newExtSettlementRequestBuilder() {
        return ExtSettlementRequest.newBuilder();
    }

    public static ExtSettlementAckRequest.Builder newExtSettlementAckRequestBuilder() {
        return ExtSettlementAckRequest.newBuilder();
    }

    public static MaxStakeRequest.Builder newMaxStakeRequestBuilder() {
        return MaxStakeRequest.newBuilder();
    }

    public static PayoutModifierSettlementRequest.Builder newPayoutModifierSettlementRequestBuilder() {
        return PayoutModifierSettlementRequest.newBuilder();
    }

    public static TicketRequest.Builder newTicketRequestBuilder() {
        return TicketRequest.newBuilder();
    }

    public static TicketAckRequest.Builder newTicketAckRequestBuilder() {
        return TicketAckRequest.newBuilder();
    }

    public static TicketBuildRequest.Builder newTicketBuildRequestBuilder() {
        return TicketBuildRequest.newBuilder();
    }

    public static TicketInformRequest.Builder newTicketInformRequestBuilder() {
        return TicketInformRequest.newBuilder();
    }

    public static WithdrawalInformRequest.Builder newWithdrawalInformRequestBuilder() {
        return WithdrawalInformRequest.newBuilder();
    }

}

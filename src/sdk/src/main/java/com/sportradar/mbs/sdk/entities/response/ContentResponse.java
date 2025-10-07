package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AccountInterventionInformResponse.class, name = "account-intervention-inform-reply"),
        @JsonSubTypes.Type(value = AccountLimitInformResponse.class, name = "account-limit-inform-reply"),
        @JsonSubTypes.Type(value = AccountLimitReachedInformResponse.class, name = "account-limit-reached-inform-reply"),
        @JsonSubTypes.Type(value = AccountStatusInformResponse.class, name = "account-status-inform-reply"),
        @JsonSubTypes.Type(value = BalanceChangeInformResponse.class, name = "balance-change-inform-reply"),
        @JsonSubTypes.Type(value = CancelAckResponse.class, name = "cancel-ack-reply"),
        @JsonSubTypes.Type(value = CancelResponse.class, name = "cancel-reply"),
        @JsonSubTypes.Type(value = CashoutAckResponse.class, name = "cashout-ack-reply"),
        @JsonSubTypes.Type(value = CashoutBuildResponse.class, name = "cashout-build-reply"),
        @JsonSubTypes.Type(value = CashoutInformResponse.class, name = "cashout-inform-reply"),
        @JsonSubTypes.Type(value = CashoutPlacementResponse.class, name = "cashout-placement-reply"),
        @JsonSubTypes.Type(value = CashoutResponse.class, name = "cashout-reply"),
        @JsonSubTypes.Type(value = CasinoSessionsResponse.class, name = "casino-sessions-inform-reply"),
        @JsonSubTypes.Type(value = DepositInformResponse.class, name = "deposit-inform-reply"),
        @JsonSubTypes.Type(value = ErrorResponse.class, name = "error-reply"),
        @JsonSubTypes.Type(value = ExtSettlementAckResponse.class, name = "ext-settlement-ack-reply"),
        @JsonSubTypes.Type(value = ExtSettlementResponse.class, name = "ext-settlement-reply"),
        @JsonSubTypes.Type(value = MaxStakeResponse.class, name = "max-stake-reply"),
        @JsonSubTypes.Type(value = PayoutModifierSettlementResponse.class, name = "payout-modifier-settlement-reply"),
        @JsonSubTypes.Type(value = TicketAckResponse.class, name = "ticket-ack-reply"),
        @JsonSubTypes.Type(value = TicketBuildResponse.class, name = "ticket-build-reply"),
        @JsonSubTypes.Type(value = TicketInformResponse.class, name = "ticket-inform-reply"),
        @JsonSubTypes.Type(value = TicketResponse.class, name = "ticket-reply"),
        @JsonSubTypes.Type(value = WithdrawalInformResponse.class, name = "withdrawal-inform-reply")
})
public abstract class ContentResponse {


    public static AccountInterventionInformResponse.Builder newAccountInterventionInformResponseBuilder() {
        return AccountInterventionInformResponse.newBuilder();
    }

    public static AccountLimitInformResponse.Builder newAccountLimitInformResponseBuilder() {
        return AccountLimitInformResponse.newBuilder();
    }

    public static AccountLimitReachedInformResponse.Builder newAccountLimitReachedInformResponseBuilder() {
        return AccountLimitReachedInformResponse.newBuilder();
    }

    public static AccountStatusInformResponse.Builder newAccountStatusInformResponseBuilder() {
        return AccountStatusInformResponse.newBuilder();
    }

    public static BalanceChangeInformResponse.Builder newBalanceChangeInformResponseBuilder() {
        return BalanceChangeInformResponse.newBuilder();
    }

    public static CancelAckResponse.Builder newCancelAckResponseBuilder() {
        return CancelAckResponse.newBuilder();
    }

    public static CancelResponse.Builder newCancelResponseBuilder() {
        return CancelResponse.newBuilder();
    }

    public static CashoutAckResponse.Builder newCashoutAckResponseBuilder() {
        return CashoutAckResponse.newBuilder();
    }

    public static CashoutBuildResponse.Builder newCashoutBuildResponseBuilder() {
        return CashoutBuildResponse.newBuilder();
    }

    public static CashoutInformResponse.Builder newCashoutInformResponseBuilder() {
        return CashoutInformResponse.newBuilder();
    }

    public static CashoutPlacementResponse.Builder newCashoutPlacementResponseBuilder() {
        return CashoutPlacementResponse.newBuilder();
    }

    public static CashoutResponse.Builder newCashoutResponseBuilder() {
        return CashoutResponse.newBuilder();
    }

    public static CasinoSessionsResponse.Builder newCasinoSessionsResponseBuilder() {
        return CasinoSessionsResponse.newBuilder();
    }

    public static DepositInformResponse.Builder newDepositInformResponseBuilder() {
        return DepositInformResponse.newBuilder();
    }

    public static ErrorResponse.Builder newErrorResponseBuilder() {
        return ErrorResponse.newBuilder();
    }

    public static ExtSettlementAckResponse.Builder newExtSettlementAckResponseBuilder() {
        return ExtSettlementAckResponse.newBuilder();
    }

    public static ExtSettlementResponse.Builder newExtSettlementResponseBuilder() {
        return ExtSettlementResponse.newBuilder();
    }

    public static MaxStakeResponse.Builder newMaxStakeResponseBuilder() {
        return MaxStakeResponse.newBuilder();
    }

    public static PayoutModifierSettlementResponse.Builder newPayoutModifierSettlementResponseBuilder() {
        return PayoutModifierSettlementResponse.newBuilder();
    }

    public static TicketAckResponse.Builder newTicketAckResponseBuilder() {
        return TicketAckResponse.newBuilder();
    }

    public static TicketBuildResponse.Builder newTicketBuildResponseBuilder() {
        return TicketBuildResponse.newBuilder();
    }

    public static TicketInformResponse.Builder newTicketInformResponseBuilder() {
        return TicketInformResponse.newBuilder();
    }

    public static TicketResponse.Builder newTicketResponseBuilder() {
        return TicketResponse.newBuilder();
    }

    public static WithdrawalInformResponse.Builder newWithdrawalInformResponseBuilder() {
        return WithdrawalInformResponse.newBuilder();
    }

}

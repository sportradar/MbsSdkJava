package com.sportradar.mbs.sdk.entities.cashout;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BetCashoutDetails.class, name = "bet"),
        @JsonSubTypes.Type(value = BetPartialCashoutDetails.class, name = "bet-partial"),
        @JsonSubTypes.Type(value = TicketCashoutDetails.class, name = "ticket"),
        @JsonSubTypes.Type(value = TicketPartialCashoutDetails.class, name = "ticket-partial")
})
public abstract class CashoutDetails {

    public static BetCashoutDetails.Builder newBetCashoutDetailsBuilder() {
        return BetCashoutDetails.newBuilder();
    }

    public static BetPartialCashoutDetails.Builder newBetPartialCashoutDetailsBuilder() {
        return BetPartialCashoutDetails.newBuilder();
    }

    public static TicketCashoutDetails.Builder newTicketCashoutDetailsBuilder() {
        return TicketCashoutDetails.newBuilder();
    }

    public static TicketPartialCashoutDetails.Builder newTicketPartialCashoutDetailsBuilder() {
        return TicketPartialCashoutDetails.newBuilder();
    }

}

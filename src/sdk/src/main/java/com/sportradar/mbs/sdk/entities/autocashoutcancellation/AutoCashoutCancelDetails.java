package com.sportradar.mbs.sdk.entities.autocashoutcancellation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BetAutoCashoutCancelDetails.class, name = "bet"),
        @JsonSubTypes.Type(value = TicketAutoCashoutCancelDetails.class, name = "ticket")
})
public abstract class AutoCashoutCancelDetails {

    public static BetAutoCashoutCancelDetails.Builder newBetAutoCashoutCancelDetailsBuilder() {
        return BetAutoCashoutCancelDetails.newBuilder();
    }

    public static TicketAutoCashoutCancelDetails.Builder newTicketAutoCashoutCancelDetailsBuilder() {
        return TicketAutoCashoutCancelDetails.newBuilder();
    }
}

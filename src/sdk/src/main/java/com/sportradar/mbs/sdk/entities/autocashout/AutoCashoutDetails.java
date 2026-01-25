package com.sportradar.mbs.sdk.entities.autocashout;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BetAutoCashoutDetails.class, name = "bet"),
        @JsonSubTypes.Type(value = TicketAutoCashoutDetails.class, name = "ticket")
})
public abstract class AutoCashoutDetails {

    public static BetAutoCashoutDetails.Builder newBetAutoCashoutDetailsBuilder() {
        return BetAutoCashoutDetails.newBuilder();
    }

    public static TicketAutoCashoutDetails.Builder newTicketAutoCashoutDetailsBuilder() {
        return TicketAutoCashoutDetails.newBuilder();
    }
}

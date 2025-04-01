package com.sportradar.mbs.sdk.entities.settlement;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BetExtSettlementDetails.class, name = "bet"),
        @JsonSubTypes.Type(value = TicketExtSettlementDetails.class, name = "ticket")
})
public abstract class ExtSettlementDetails {

    public static BetExtSettlementDetails.Builder newBetExtSettlementDetailsBuilder() {
        return BetExtSettlementDetails.newBuilder();
    }

    public static TicketExtSettlementDetails.Builder newTicketExtSettlementDetailsBuilder() {
        return TicketExtSettlementDetails.newBuilder();
    }

}

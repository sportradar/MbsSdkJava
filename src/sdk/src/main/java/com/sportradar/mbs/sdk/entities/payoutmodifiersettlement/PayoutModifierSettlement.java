package com.sportradar.mbs.sdk.entities.payoutmodifiersettlement;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OddsPayoutModifierSettlement.class, name = "odds"),
        @JsonSubTypes.Type(value = ResultPayoutModifierSettlement.class, name = "result")
})
public abstract class PayoutModifierSettlement {


    public static OddsPayoutModifierSettlement.Builder newOddsPayoutModifierSettlementBuilder() {
        return OddsPayoutModifierSettlement.newBuilder();
    }

    public static ResultPayoutModifierSettlement.Builder newResultPayoutModifierSettlementBuilder() {
        return ResultPayoutModifierSettlement.newBuilder();
    }

}

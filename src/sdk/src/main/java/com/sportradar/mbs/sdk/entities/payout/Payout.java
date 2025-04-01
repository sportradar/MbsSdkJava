package com.sportradar.mbs.sdk.entities.payout;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CashPayout.class, name = "cash"),
        @JsonSubTypes.Type(value = FreePayout.class, name = "free"),
        @JsonSubTypes.Type(value = WithheldPayout.class, name = "withheld")
})
public abstract class Payout {

    public static CashPayout.Builder newCashPayoutBuilder() {
        return CashPayout.newBuilder();
    }

    public static FreePayout.Builder newFreePayoutBuilder() {
        return FreePayout.newBuilder();
    }

    public static WithheldPayout.Builder newWithheldPayoutBuilder() {
        return WithheldPayout.newBuilder();
    }

}

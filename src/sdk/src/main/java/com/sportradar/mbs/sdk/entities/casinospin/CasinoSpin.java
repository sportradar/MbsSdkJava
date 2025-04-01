package com.sportradar.mbs.sdk.entities.casinospin;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BonusCasinoSpin.class, name = "bonus"),
        @JsonSubTypes.Type(value = FreeCasinoSpin.class, name = "free"),
        @JsonSubTypes.Type(value = OrdinaryCasinoSpin.class, name = "ordinary")
})
public abstract class CasinoSpin {

    public static BonusCasinoSpin.Builder newBonusCasinoSpinBuilder() {
        return BonusCasinoSpin.newBuilder();
    }

    public static FreeCasinoSpin.Builder newFreeCasinoSpinBuilder() {
        return FreeCasinoSpin.newBuilder();
    }

    public static OrdinaryCasinoSpin.Builder newOrdinaryCasinoSpinBuilder() {
        return OrdinaryCasinoSpin.newBuilder();
    }

}

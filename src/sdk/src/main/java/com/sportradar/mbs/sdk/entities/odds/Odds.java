package com.sportradar.mbs.sdk.entities.odds;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DecimalOdds.class, name = "decimal"),
        @JsonSubTypes.Type(value = FractionalOdds.class, name = "fractional"),
        @JsonSubTypes.Type(value = HongKongOdds.class, name = "hong-kong"),
        @JsonSubTypes.Type(value = IndonesianOdds.class, name = "indonesian"),
        @JsonSubTypes.Type(value = MalayOdds.class, name = "malay"),
        @JsonSubTypes.Type(value = MoneylineOdds.class, name = "moneyline")
})
public abstract class Odds {

    public static DecimalOdds.Builder newDecimalOddsBuilder() {
        return DecimalOdds.newBuilder();
    }

    public static FractionalOdds.Builder newFractionalOddsBuilder() {
        return FractionalOdds.newBuilder();
    }

    public static HongKongOdds.Builder newHongKongOddsBuilder() {
        return HongKongOdds.newBuilder();
    }

    public static IndonesianOdds.Builder newIndonesianOddsBuilder() {
        return IndonesianOdds.newBuilder();
    }

    public static MalayOdds.Builder newMalayOddsBuilder() {
        return MalayOdds.newBuilder();
    }

    public static MoneylineOdds.Builder newMoneylineOddsBuilder() {
        return MoneylineOdds.newBuilder();
    }

}

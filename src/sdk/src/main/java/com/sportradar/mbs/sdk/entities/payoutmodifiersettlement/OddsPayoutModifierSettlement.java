package com.sportradar.mbs.sdk.entities.payoutmodifiersettlement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class OddsPayoutModifierSettlement extends PayoutModifierSettlement {

    @JsonProperty("odds")
    private Odds odds;

    public Odds getOdds() {
        return this.odds;
    }

    public void setOdds(Odds value) {
        this.odds = value;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final OddsPayoutModifierSettlement instance = new OddsPayoutModifierSettlement();

        private Builder() {
        }

        public OddsPayoutModifierSettlement build() {
            return this.instance;
        }

        public Builder setOdds(Odds value) {
            this.instance.setOdds(value);
            return this;
        }
    }
}

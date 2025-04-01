package com.sportradar.mbs.sdk.entities.odds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class DecimalOdds extends Odds {

    @JsonProperty("value")
    private BigDecimal value;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public static class Builder {

        private final DecimalOdds instance = new DecimalOdds();

        private Builder() {
        }

        public DecimalOdds build() {
            return this.instance;
        }

        public Builder setValue(BigDecimal value) {
            this.instance.setValue(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.odds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class FractionalOdds extends Odds {

    @JsonProperty("numerator")
    private BigInteger numerator;
    @JsonProperty("denominator")
    private BigInteger denominator;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigInteger getNumerator() {
        return this.numerator;
    }

    public void setNumerator(BigInteger value) {
        this.numerator = value;
    }

    public BigInteger getDenominator() {
        return this.denominator;
    }

    public void setDenominator(BigInteger value) {
        this.denominator = value;
    }

    public static class Builder {

        private final FractionalOdds instance = new FractionalOdds();

        private Builder() {
        }

        public FractionalOdds build() {
            return this.instance;
        }

        public Builder setNumerator(BigInteger value) {
            this.instance.setNumerator(value);
            return this;
        }

        public Builder setDenominator(BigInteger value) {
            this.instance.setDenominator(value);
            return this;
        }
    }
}

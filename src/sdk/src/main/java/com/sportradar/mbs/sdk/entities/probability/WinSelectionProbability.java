package com.sportradar.mbs.sdk.entities.probability;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class WinSelectionProbability extends SelectionProbability {

    @JsonProperty("win")
    private BigDecimal win;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getWin() {
        return this.win;
    }

    public void setWin(BigDecimal value) {
        this.win = value;
    }

    public static class Builder {

        private final WinSelectionProbability instance = new WinSelectionProbability();

        private Builder() {
        }

        public WinSelectionProbability build() {
            return this.instance;
        }

        public Builder setWin(BigDecimal value) {
            this.instance.setWin(value);
            return this;
        }
    }
}

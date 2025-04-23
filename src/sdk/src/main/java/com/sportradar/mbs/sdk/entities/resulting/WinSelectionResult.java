package com.sportradar.mbs.sdk.entities.resulting;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class WinSelectionResult extends SelectionResult {

    @JsonProperty("voidFactor")
    private BigDecimal voidFactor;
    @JsonProperty("deadHeatFactor")
    private BigDecimal deadHeatFactor;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getVoidFactor() {
        return this.voidFactor;
    }

    public void setVoidFactor(BigDecimal value) {
        this.voidFactor = value;
    }

    public BigDecimal getDeadHeatFactor() {
        return this.deadHeatFactor;
    }

    public void setDeadHeatFactor(BigDecimal value) {
        this.deadHeatFactor = value;
    }

    public static class Builder {

        private final WinSelectionResult instance = new WinSelectionResult();

        private Builder() {
        }

        public WinSelectionResult build() {
            return this.instance;
        }

        public Builder setVoidFactor(BigDecimal value) {
            this.instance.setVoidFactor(value);
            return this;
        }

        public Builder setDeadHeatFactor(BigDecimal value) {
            this.instance.setDeadHeatFactor(value);
            return this;
        }
    }
}

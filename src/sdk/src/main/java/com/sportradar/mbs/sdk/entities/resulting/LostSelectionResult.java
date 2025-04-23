package com.sportradar.mbs.sdk.entities.resulting;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class LostSelectionResult extends SelectionResult {

    @JsonProperty("voidFactor")
    private BigDecimal voidFactor;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getVoidFactor() {
        return this.voidFactor;
    }

    public void setVoidFactor(BigDecimal value) {
        this.voidFactor = value;
    }

    public static class Builder {

        private final LostSelectionResult instance = new LostSelectionResult();

        private Builder() {
        }

        public LostSelectionResult build() {
            return this.instance;
        }

        public Builder setVoidFactor(BigDecimal value) {
            this.instance.setVoidFactor(value);
            return this;
        }
    }
}

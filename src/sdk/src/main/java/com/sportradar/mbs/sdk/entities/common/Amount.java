package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Amount {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("value")
    private BigDecimal value;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String value) {
        this.currency = value;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public static class Builder {

        private final Amount instance = new Amount();

        private Builder() {
        }

        public Amount build() {
            return this.instance;
        }

        public Builder setCurrency(String value) {
            this.instance.setCurrency(value);
            return this;
        }

        public Builder setValue(BigDecimal value) {
            this.instance.setValue(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ExchangeRate {

    @JsonProperty("toCurrency")
    private String toCurrency;
    @JsonProperty("rate")
    private BigDecimal rate;
    @JsonProperty("fromCurrency")
    private String fromCurrency;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getToCurrency() {
        return this.toCurrency;
    }

    public void setToCurrency(String value) {
        this.toCurrency = value;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    public String getFromCurrency() {
        return this.fromCurrency;
    }

    public void setFromCurrency(String value) {
        this.fromCurrency = value;
    }

    public static class Builder {

        private final ExchangeRate instance = new ExchangeRate();

        private Builder() {
        }

        public ExchangeRate build() {
            return this.instance;
        }

        public Builder setToCurrency(String value) {
            this.instance.setToCurrency(value);
            return this;
        }

        public Builder setRate(BigDecimal value) {
            this.instance.setRate(value);
            return this;
        }

        public Builder setFromCurrency(String value) {
            this.instance.setFromCurrency(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CashoutSuggestions {

    @JsonProperty("fairCashout")
    private BigDecimal fairCashout;
    @JsonProperty("simpleCashout")
    private BigDecimal simpleCashout;
    @JsonProperty("cashoutId")
    private String cashoutId;
    @JsonProperty("cashoutType")
    private String cashoutType;
    @JsonProperty("maxWinCurrent")
    private BigDecimal maxWinCurrent;
    @JsonProperty("partialCashout")
    private BigDecimal partialCashout;
    @JsonProperty("currency")
    private String currency;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getFairCashout() {
        return this.fairCashout;
    }

    public void setFairCashout(BigDecimal value) {
        this.fairCashout = value;
    }

    public BigDecimal getSimpleCashout() {
        return this.simpleCashout;
    }

    public void setSimpleCashout(BigDecimal value) {
        this.simpleCashout = value;
    }

    public String getCashoutId() {
        return this.cashoutId;
    }

    public void setCashoutId(String value) {
        this.cashoutId = value;
    }

    public String getCashoutType() {
        return this.cashoutType;
    }

    public void setCashoutType(String value) {
        this.cashoutType = value;
    }

    public BigDecimal getMaxWinCurrent() {
        return this.maxWinCurrent;
    }

    public void setMaxWinCurrent(BigDecimal value) {
        this.maxWinCurrent = value;
    }

    public BigDecimal getPartialCashout() {
        return this.partialCashout;
    }

    public void setPartialCashout(BigDecimal value) {
        this.partialCashout = value;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String value) {
        this.currency = value;
    }

    public static class Builder {

        private final CashoutSuggestions instance = new CashoutSuggestions();

        private Builder() {
        }

        public CashoutSuggestions build() {
            return this.instance;
        }

        public Builder setFairCashout(BigDecimal value) {
            this.instance.setFairCashout(value);
            return this;
        }

        public Builder setSimpleCashout(BigDecimal value) {
            this.instance.setSimpleCashout(value);
            return this;
        }

        public Builder setCashoutId(String value) {
            this.instance.setCashoutId(value);
            return this;
        }

        public Builder setCashoutType(String value) {
            this.instance.setCashoutType(value);
            return this;
        }

        public Builder setMaxWinCurrent(BigDecimal value) {
            this.instance.setMaxWinCurrent(value);
            return this;
        }

        public Builder setPartialCashout(BigDecimal value) {
            this.instance.setPartialCashout(value);
            return this;
        }

        public Builder setCurrency(String value) {
            this.instance.setCurrency(value);
            return this;
        }
    }
}

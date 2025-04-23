package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

import java.util.List;

public class CashoutSuggestions {

    @JsonProperty("fairCashout")
    private Payout[] fairCashout;
    @JsonProperty("cashoutId")
    private String cashoutId;
    @JsonProperty("cashoutType")
    private String cashoutType;
    @JsonProperty("maxPayout")
    private Payout[] maxPayout;
    @JsonProperty("cashout")
    private Payout[] cashout;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Payout[] getFairCashout() {
        return this.fairCashout;
    }

    public void setFairCashout(Payout[] value) {
        this.fairCashout = value;
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

    public Payout[] getMaxPayout() {
        return this.maxPayout;
    }

    public void setMaxPayout(Payout[] value) {
        this.maxPayout = value;
    }

    public Payout[] getCashout() {
        return this.cashout;
    }

    public void setCashout(Payout[] value) {
        this.cashout = value;
    }

    public static class Builder {

        private final CashoutSuggestions instance = new CashoutSuggestions();

        private Builder() {
        }

        public CashoutSuggestions build() {
            return this.instance;
        }

        public Builder setFairCashout(Payout... value) {
            this.instance.setFairCashout(value);
            return this;
        }

        public Builder setFairCashout(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setFairCashout(arr);
        }

        public Builder setCashoutId(String value) {
            this.instance.setCashoutId(value);
            return this;
        }

        public Builder setCashoutType(String value) {
            this.instance.setCashoutType(value);
            return this;
        }

        public Builder setMaxPayout(Payout... value) {
            this.instance.setMaxPayout(value);
            return this;
        }

        public Builder setMaxPayout(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setMaxPayout(arr);
        }

        public Builder setCashout(Payout... value) {
            this.instance.setCashout(value);
            return this;
        }

        public Builder setCashout(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setCashout(arr);
        }
    }
}

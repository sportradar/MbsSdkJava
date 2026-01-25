package com.sportradar.mbs.sdk.entities.autocashoutthreshold;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

import java.math.BigDecimal;
import java.util.List;

public class StopLossAutoCashoutThreshold extends AutoCashoutThreshold {

    @JsonProperty("percentage")
    private BigDecimal percentage;
    @JsonProperty("payout")
    private Payout[] payout;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getPercentage() {
        return this.percentage;
    }

    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    public Payout[] getPayout() {
        return this.payout;
    }

    public void setPayout(Payout[] value) {
        this.payout = value;
    }

    public static class Builder {

        private final StopLossAutoCashoutThreshold instance = new StopLossAutoCashoutThreshold();

        private Builder() {
        }

        public StopLossAutoCashoutThreshold build() {
            return this.instance;
        }

        public Builder setPercentage(BigDecimal value) {
            this.instance.setPercentage(value);
            return this;
        }

        public Builder setPayout(Payout... value) {
            this.instance.setPayout(value);
            return this;
        }

        public Builder setPayout(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setPayout(arr);
        }
    }
}

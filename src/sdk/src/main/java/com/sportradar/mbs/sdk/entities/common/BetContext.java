package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

import java.util.List;

public class BetContext {

    @JsonProperty("oddsChange")
    private OddsChange oddsChange;
    @JsonProperty("payoutCap")
    private Payout[] payoutCap;

    public static Builder newBuilder() {
        return new Builder();
    }

    public OddsChange getOddsChange() {
        return this.oddsChange;
    }

    public void setOddsChange(OddsChange value) {
        this.oddsChange = value;
    }

    public Payout[] getPayoutCap() {
        return this.payoutCap;
    }

    public void setPayoutCap(Payout[] value) {
        this.payoutCap = value;
    }

    public static class Builder {

        private final BetContext instance = new BetContext();

        private Builder() {
        }

        public BetContext build() {
            return this.instance;
        }

        public Builder setOddsChange(OddsChange value) {
            this.instance.setOddsChange(value);
            return this;
        }

        public Builder setPayoutCap(Payout... value) {
            this.instance.setPayoutCap(value);
            return this;
        }

        public Builder setPayoutCap(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setPayoutCap(arr);
        }
    }
}

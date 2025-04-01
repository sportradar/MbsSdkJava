package com.sportradar.mbs.sdk.entities.stake;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class FreeCashStake extends Stake {

    @JsonProperty("mode")
    private StakeMode mode;
    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("currency")
    private String currency;

    public static Builder newBuilder() {
        return new Builder();
    }

    public StakeMode getMode() {
        return this.mode;
    }

    public void setMode(StakeMode value) {
        this.mode = value;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String value) {
        this.traceId = value;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String value) {
        this.currency = value;
    }

    public static class Builder {

        private final FreeCashStake instance = new FreeCashStake();

        private Builder() {
        }

        public FreeCashStake build() {
            return this.instance;
        }

        public Builder setMode(StakeMode value) {
            this.instance.setMode(value);
            return this;
        }

        public Builder setTraceId(String value) {
            this.instance.setTraceId(value);
            return this;
        }

        public Builder setAmount(BigDecimal value) {
            this.instance.setAmount(value);
            return this;
        }

        public Builder setCurrency(String value) {
            this.instance.setCurrency(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.payout;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class FreePayout extends Payout {

    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("source")
    private PayoutSourceType source;

    public static Builder newBuilder() {
        return new Builder();
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

    public PayoutSourceType getSource() {
        return this.source;
    }

    public void setSource(PayoutSourceType value) {
        this.source = value;
    }

    public static class Builder {

        private final FreePayout instance = new FreePayout();

        private Builder() {
        }

        public FreePayout build() {
            return this.instance;
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

        public Builder setSource(PayoutSourceType value) {
            this.instance.setSource(value);
            return this;
        }
    }
}

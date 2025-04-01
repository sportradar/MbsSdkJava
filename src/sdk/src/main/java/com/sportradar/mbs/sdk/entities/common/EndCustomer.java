package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class EndCustomer {

    @JsonProperty("confidence")
    private BigDecimal confidence;
    @JsonProperty("id")
    private String id;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getConfidence() {
        return this.confidence;
    }

    public void setConfidence(BigDecimal value) {
        this.confidence = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public static class Builder {

        private final EndCustomer instance = new EndCustomer();

        private Builder() {
        }

        public EndCustomer build() {
            return this.instance;
        }

        public Builder setConfidence(BigDecimal value) {
            this.instance.setConfidence(value);
            return this;
        }

        public Builder setId(String value) {
            this.instance.setId(value);
            return this;
        }
    }
}

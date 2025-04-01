package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentGateway {

    @JsonProperty("method")
    private PaymentMethod method;
    @JsonProperty("provider")
    private String provider;
    @JsonProperty("executedAtUtc")
    private long executedAtUtc;
    @JsonProperty("initiatedAtUtc")
    private Long initiatedAtUtc;
    @JsonProperty("referenceId")
    private String referenceId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public PaymentMethod getMethod() {
        return this.method;
    }

    public void setMethod(PaymentMethod value) {
        this.method = value;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String value) {
        this.provider = value;
    }

    public long getExecutedAtUtc() {
        return this.executedAtUtc;
    }

    public void setExecutedAtUtc(long value) {
        this.executedAtUtc = value;
    }

    public Long getInitiatedAtUtc() {
        return this.initiatedAtUtc;
    }

    public void setInitiatedAtUtc(Long value) {
        this.initiatedAtUtc = value;
    }

    public String getReferenceId() {
        return this.referenceId;
    }

    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    public static class Builder {

        private final PaymentGateway instance = new PaymentGateway();

        private Builder() {
        }

        public PaymentGateway build() {
            return this.instance;
        }

        public Builder setMethod(PaymentMethod value) {
            this.instance.setMethod(value);
            return this;
        }

        public Builder setProvider(String value) {
            this.instance.setProvider(value);
            return this;
        }

        public Builder setExecutedAtUtc(long value) {
            this.instance.setExecutedAtUtc(value);
            return this;
        }

        public Builder setInitiatedAtUtc(Long value) {
            this.instance.setInitiatedAtUtc(value);
            return this;
        }

        public Builder setReferenceId(String value) {
            this.instance.setReferenceId(value);
            return this;
        }
    }
}

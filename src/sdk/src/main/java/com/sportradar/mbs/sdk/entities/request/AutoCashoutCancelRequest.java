package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.autocashoutcancellation.AutoCashoutCancelDetails;

public class AutoCashoutCancelRequest extends ContentRequest {

    @JsonProperty("details")
    private AutoCashoutCancelDetails details;
    @JsonProperty("cancellationId")
    private String cancellationId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public AutoCashoutCancelDetails getDetails() {
        return this.details;
    }

    public void setDetails(AutoCashoutCancelDetails value) {
        this.details = value;
    }

    public String getCancellationId() {
        return this.cancellationId;
    }

    public void setCancellationId(String value) {
        this.cancellationId = value;
    }

    public static class Builder {

        private final AutoCashoutCancelRequest instance = new AutoCashoutCancelRequest();

        private Builder() {
        }

        public AutoCashoutCancelRequest build() {
            return this.instance;
        }

        public Builder setDetails(AutoCashoutCancelDetails value) {
            this.instance.setDetails(value);
            return this;
        }

        public Builder setCancellationId(String value) {
            this.instance.setCancellationId(value);
            return this;
        }
    }
}

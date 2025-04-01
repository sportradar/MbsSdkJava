package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.cancellation.CancelDetails;

public class CancelRequest extends ContentRequest {

    @JsonProperty("details")
    private CancelDetails details;
    @JsonProperty("cancellationId")
    private String cancellationId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public CancelDetails getDetails() {
        return this.details;
    }

    public void setDetails(CancelDetails value) {
        this.details = value;
    }

    public String getCancellationId() {
        return this.cancellationId;
    }

    public void setCancellationId(String value) {
        this.cancellationId = value;
    }

    public static class Builder {

        private final CancelRequest instance = new CancelRequest();

        private Builder() {
        }

        public CancelRequest build() {
            return this.instance;
        }

        public Builder setDetails(CancelDetails value) {
            this.instance.setDetails(value);
            return this;
        }

        public Builder setCancellationId(String value) {
            this.instance.setCancellationId(value);
            return this;
        }
    }
}

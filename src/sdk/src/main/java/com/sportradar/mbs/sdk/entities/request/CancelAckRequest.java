package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelAckRequest extends ContentRequest {

    @JsonProperty("cancellationSignature")
    private String cancellationSignature;
    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("cancellationId")
    private String cancellationId;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCancellationSignature() {
        return this.cancellationSignature;
    }

    public void setCancellationSignature(String value) {
        this.cancellationSignature = value;
    }

    public boolean getAcknowledged() {
        return this.acknowledged;
    }

    public void setAcknowledged(boolean value) {
        this.acknowledged = value;
    }

    public String getCancellationId() {
        return this.cancellationId;
    }

    public void setCancellationId(String value) {
        this.cancellationId = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final CancelAckRequest instance = new CancelAckRequest();

        private Builder() {
        }

        public CancelAckRequest build() {
            return this.instance;
        }

        public Builder setCancellationSignature(String value) {
            this.instance.setCancellationSignature(value);
            return this;
        }

        public Builder setAcknowledged(boolean value) {
            this.instance.setAcknowledged(value);
            return this;
        }

        public Builder setCancellationId(String value) {
            this.instance.setCancellationId(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}

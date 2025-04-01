package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketAckRequest extends ContentRequest {

    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean getAcknowledged() {
        return this.acknowledged;
    }

    public void setAcknowledged(boolean value) {
        this.acknowledged = value;
    }

    public String getTicketSignature() {
        return this.ticketSignature;
    }

    public void setTicketSignature(String value) {
        this.ticketSignature = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final TicketAckRequest instance = new TicketAckRequest();

        private Builder() {
        }

        public TicketAckRequest build() {
            return this.instance;
        }

        public Builder setAcknowledged(boolean value) {
            this.instance.setAcknowledged(value);
            return this;
        }

        public Builder setTicketSignature(String value) {
            this.instance.setTicketSignature(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}

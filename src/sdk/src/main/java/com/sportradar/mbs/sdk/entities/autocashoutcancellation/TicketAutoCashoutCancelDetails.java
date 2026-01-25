package com.sportradar.mbs.sdk.entities.autocashoutcancellation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketAutoCashoutCancelDetails extends AutoCashoutCancelDetails {

    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
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

        private final TicketAutoCashoutCancelDetails instance = new TicketAutoCashoutCancelDetails();

        private Builder() {
        }

        public TicketAutoCashoutCancelDetails build() {
            return this.instance;
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

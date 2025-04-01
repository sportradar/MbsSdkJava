package com.sportradar.mbs.sdk.entities.ref;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AltStakeTicketRef extends TicketRef {

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

        private final AltStakeTicketRef instance = new AltStakeTicketRef();

        private Builder() {
        }

        public AltStakeTicketRef build() {
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

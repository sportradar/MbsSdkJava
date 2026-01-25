package com.sportradar.mbs.sdk.entities.autocashoutcancellation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetAutoCashoutCancelDetails extends AutoCashoutCancelDetails {

    @JsonProperty("betId")
    private String betId;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String value) {
        this.betId = value;
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

        private final BetAutoCashoutCancelDetails instance = new BetAutoCashoutCancelDetails();

        private Builder() {
        }

        public BetAutoCashoutCancelDetails build() {
            return this.instance;
        }

        public Builder setBetId(String value) {
            this.instance.setBetId(value);
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

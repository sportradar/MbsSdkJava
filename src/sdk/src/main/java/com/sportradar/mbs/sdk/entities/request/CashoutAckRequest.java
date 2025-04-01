package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CashoutAckRequest extends ContentRequest {

    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("cashoutId")
    private String cashoutId;
    @JsonProperty("cashoutSignature")
    private String cashoutSignature;
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

    public String getCashoutId() {
        return this.cashoutId;
    }

    public void setCashoutId(String value) {
        this.cashoutId = value;
    }

    public String getCashoutSignature() {
        return this.cashoutSignature;
    }

    public void setCashoutSignature(String value) {
        this.cashoutSignature = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final CashoutAckRequest instance = new CashoutAckRequest();

        private Builder() {
        }

        public CashoutAckRequest build() {
            return this.instance;
        }

        public Builder setAcknowledged(boolean value) {
            this.instance.setAcknowledged(value);
            return this;
        }

        public Builder setCashoutId(String value) {
            this.instance.setCashoutId(value);
            return this;
        }

        public Builder setCashoutSignature(String value) {
            this.instance.setCashoutSignature(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}

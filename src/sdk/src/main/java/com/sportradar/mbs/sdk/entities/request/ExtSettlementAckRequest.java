package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtSettlementAckRequest extends ContentRequest {

    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("settlementSignature")
    private String settlementSignature;
    @JsonProperty("settlementId")
    private String settlementId;
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

    public String getSettlementSignature() {
        return this.settlementSignature;
    }

    public void setSettlementSignature(String value) {
        this.settlementSignature = value;
    }

    public String getSettlementId() {
        return this.settlementId;
    }

    public void setSettlementId(String value) {
        this.settlementId = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final ExtSettlementAckRequest instance = new ExtSettlementAckRequest();

        private Builder() {
        }

        public ExtSettlementAckRequest build() {
            return this.instance;
        }

        public Builder setAcknowledged(boolean value) {
            this.instance.setAcknowledged(value);
            return this;
        }

        public Builder setSettlementSignature(String value) {
            this.instance.setSettlementSignature(value);
            return this;
        }

        public Builder setSettlementId(String value) {
            this.instance.setSettlementId(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}

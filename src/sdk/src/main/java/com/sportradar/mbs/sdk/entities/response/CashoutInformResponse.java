package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.AcceptanceStatus;

public class CashoutInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("cashoutId")
    private String cashoutId;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ticketId")
    private String ticketId;
    @JsonProperty("status")
    private AcceptanceStatus status;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int value) {
        this.code = value;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String value) {
        this.signature = value;
    }

    public String getCashoutId() {
        return this.cashoutId;
    }

    public void setCashoutId(String value) {
        this.cashoutId = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public AcceptanceStatus getStatus() {
        return this.status;
    }

    public void setStatus(AcceptanceStatus value) {
        this.status = value;
    }

    public static class Builder {

        private final CashoutInformResponse instance = new CashoutInformResponse();

        private Builder() {
        }

        public CashoutInformResponse build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }

        public Builder setCashoutId(String value) {
            this.instance.setCashoutId(value);
            return this;
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }

        public Builder setStatus(AcceptanceStatus value) {
            this.instance.setStatus(value);
            return this;
        }
    }
}

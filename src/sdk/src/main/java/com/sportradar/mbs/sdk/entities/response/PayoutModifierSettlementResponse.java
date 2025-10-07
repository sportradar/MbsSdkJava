package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.AcceptanceStatus;

public class PayoutModifierSettlementResponse extends ContentResponse {

    @JsonProperty("reference")
    private String reference;
    @JsonProperty("code")
    private int code;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("settlementId")
    private String settlementId;
    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private AcceptanceStatus status;

    public String getReference() {
        return this.reference;
    }

    public void setReference(String value) {
        this.reference = value;
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

    public String getSettlementId() {
        return this.settlementId;
    }

    public void setSettlementId(String value) {
        this.settlementId = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public AcceptanceStatus getStatus() {
        return this.status;
    }

    public void setStatus(AcceptanceStatus value) {
        this.status = value;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final PayoutModifierSettlementResponse instance = new PayoutModifierSettlementResponse();

        private Builder() {
        }

        public PayoutModifierSettlementResponse build() {
            return this.instance;
        }

        public Builder setReference(String value) {
            this.instance.setReference(value);
            return this;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }

        public Builder setSettlementId(String value) {
            this.instance.setSettlementId(value);
            return this;
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }

        public Builder setStatus(AcceptanceStatus value) {
            this.instance.setStatus(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.settlement.ExtSettlementDetails;

public class ExtSettlementRequest extends ContentRequest {

    @JsonProperty("details")
    private ExtSettlementDetails details;
    @JsonProperty("settlementId")
    private String settlementId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public ExtSettlementDetails getDetails() {
        return this.details;
    }

    public void setDetails(ExtSettlementDetails value) {
        this.details = value;
    }

    public String getSettlementId() {
        return this.settlementId;
    }

    public void setSettlementId(String value) {
        this.settlementId = value;
    }

    public static class Builder {

        private final ExtSettlementRequest instance = new ExtSettlementRequest();

        private Builder() {
        }

        public ExtSettlementRequest build() {
            return this.instance;
        }

        public Builder setDetails(ExtSettlementDetails value) {
            this.instance.setDetails(value);
            return this;
        }

        public Builder setSettlementId(String value) {
            this.instance.setSettlementId(value);
            return this;
        }
    }
}

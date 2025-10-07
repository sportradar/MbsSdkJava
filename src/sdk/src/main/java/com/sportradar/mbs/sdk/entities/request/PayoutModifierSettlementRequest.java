package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payoutmodifiersettlement.PayoutModifierSettlement;

public class PayoutModifierSettlementRequest extends ContentRequest {

    @JsonProperty("reference")
    private String reference;
    @JsonProperty("settlementId")
    private String settlementId;
    @JsonProperty("settlement")
    private PayoutModifierSettlement settlement;

    public String getReference() {
        return this.reference;
    }

    public void setReference(String value) {
        this.reference = value;
    }

    public String getSettlementId() {
        return this.settlementId;
    }

    public void setSettlementId(String value) {
        this.settlementId = value;
    }

    public PayoutModifierSettlement getSettlement() {
        return this.settlement;
    }

    public void setSettlement(PayoutModifierSettlement value) {
        this.settlement = value;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final PayoutModifierSettlementRequest instance = new PayoutModifierSettlementRequest();

        private Builder() {
        }

        public PayoutModifierSettlementRequest build() {
            return this.instance;
        }

        public Builder setReference(String value) {
            this.instance.setReference(value);
            return this;
        }

        public Builder setSettlementId(String value) {
            this.instance.setSettlementId(value);
            return this;
        }

        public Builder setSettlement(PayoutModifierSettlement value) {
            this.instance.setSettlement(value);
            return this;
        }
    }
}

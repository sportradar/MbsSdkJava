package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.cashout.CashoutDetails;

public class CashoutRequest extends ContentRequest {

    @JsonProperty("cashoutId")
    private String cashoutId;
    @JsonProperty("details")
    private CashoutDetails details;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCashoutId() {
        return this.cashoutId;
    }

    public void setCashoutId(String value) {
        this.cashoutId = value;
    }

    public CashoutDetails getDetails() {
        return this.details;
    }

    public void setDetails(CashoutDetails value) {
        this.details = value;
    }

    public static class Builder {

        private final CashoutRequest instance = new CashoutRequest();

        private Builder() {
        }

        public CashoutRequest build() {
            return this.instance;
        }

        public Builder setCashoutId(String value) {
            this.instance.setCashoutId(value);
            return this;
        }

        public Builder setDetails(CashoutDetails value) {
            this.instance.setDetails(value);
            return this;
        }
    }
}

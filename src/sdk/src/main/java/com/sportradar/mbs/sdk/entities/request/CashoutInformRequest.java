package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.CashoutInformValidation;

public class CashoutInformRequest extends ContentRequest {

    @JsonProperty("validation")
    private CashoutInformValidation validation;
    @JsonProperty("cashout")
    private CashoutRequest cashout;

    public static Builder newBuilder() {
        return new Builder();
    }

    public CashoutInformValidation getValidation() {
        return this.validation;
    }

    public void setValidation(CashoutInformValidation value) {
        this.validation = value;
    }

    public CashoutRequest getCashout() {
        return this.cashout;
    }

    public void setCashout(CashoutRequest value) {
        this.cashout = value;
    }

    public static class Builder {

        private final CashoutInformRequest instance = new CashoutInformRequest();

        private Builder() {
        }

        public CashoutInformRequest build() {
            return this.instance;
        }

        public Builder setValidation(CashoutInformValidation value) {
            this.instance.setValidation(value);
            return this;
        }

        public Builder setCashout(CashoutRequest value) {
            this.instance.setCashout(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CashoutBuildRequest extends ContentRequest {

    @JsonProperty("cashout")
    private CashoutRequest cashout;

    public static Builder newBuilder() {
        return new Builder();
    }

    public CashoutRequest getCashout() {
        return this.cashout;
    }

    public void setCashout(CashoutRequest value) {
        this.cashout = value;
    }

    public static class Builder {

        private final CashoutBuildRequest instance = new CashoutBuildRequest();

        private Builder() {
        }

        public CashoutBuildRequest build() {
            return this.instance;
        }

        public Builder setCashout(CashoutRequest value) {
            this.instance.setCashout(value);
            return this;
        }
    }
}

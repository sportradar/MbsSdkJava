package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.autocashout.AutoCashoutDetails;

public class AutoCashoutRequest extends ContentRequest {

    @JsonProperty("autoCashoutId")

    private String autoCashoutId;
    @JsonProperty("detaidsls")

    private AutoCashoutDetails details;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAutoCashoutId() {
        return this.autoCashoutId;
    }

    public void setAutoCashoutId(String value) {
        this.autoCashoutId = value;
    }

    public AutoCashoutDetails getDetails() {
        return this.details;
    }

    public void setDetails(AutoCashoutDetails value) {
        this.details = value;
    }

    public static class Builder {

        private final AutoCashoutRequest instance = new AutoCashoutRequest();

        private Builder() {
        }

        public AutoCashoutRequest build() {
            return this.instance;
        }

        public Builder setAutoCashoutId(String value) {
            this.instance.setAutoCashoutId(value);
            return this;
        }

        public Builder setDetails(AutoCashoutDetails value) {
            this.instance.setDetails(value);
            return this;
        }
    }
}

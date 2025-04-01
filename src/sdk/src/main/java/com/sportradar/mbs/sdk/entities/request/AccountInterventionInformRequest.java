package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.sportradar.mbs.sdk.entities.common.InterventionMethod;

public class AccountInterventionInformRequest extends ContentRequest {

    @JsonProperty("method")
    private InterventionMethod method;
    @JsonProperty("modelInitiated")
    private boolean modelInitiated;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("comment")
    private String comment;

    public static Builder newBuilder() {
        return new Builder();
    }

    public InterventionMethod getMethod() {
        return this.method;
    }

    public void setMethod(InterventionMethod value) {
        this.method = value;
    }

    public boolean getModelInitiated() {
        return this.modelInitiated;
    }

    public void setModelInitiated(boolean value) {
        this.modelInitiated = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String value) {
        this.comment = value;
    }

    public static class Builder {

        private final AccountInterventionInformRequest instance = new AccountInterventionInformRequest();

        private Builder() {
        }

        public AccountInterventionInformRequest build() {
            return this.instance;
        }

        public Builder setMethod(InterventionMethod value) {
            this.instance.setMethod(value);
            return this;
        }

        public Builder setModelInitiated(boolean value) {
            this.instance.setModelInitiated(value);
            return this;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        public Builder setComment(String value) {
            this.instance.setComment(value);
            return this;
        }
    }
}

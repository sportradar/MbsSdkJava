package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.accountlimit.AccountLimitType;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class AccountLimitReachedInformRequest extends ContentRequest {

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("reachedLimit")
    private AccountLimitType reachedLimit;

    public static Builder newBuilder() {
        return new Builder();
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public AccountLimitType getReachedLimit() {
        return this.reachedLimit;
    }

    public void setReachedLimit(AccountLimitType value) {
        this.reachedLimit = value;
    }

    public static class Builder {

        private final AccountLimitReachedInformRequest instance = new AccountLimitReachedInformRequest();

        private Builder() {
        }

        public AccountLimitReachedInformRequest build() {
            return this.instance;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        public Builder setReachedLimit(AccountLimitType value) {
            this.instance.setReachedLimit(value);
            return this;
        }
    }
}

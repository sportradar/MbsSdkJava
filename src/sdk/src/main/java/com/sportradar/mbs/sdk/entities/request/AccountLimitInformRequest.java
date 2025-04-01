package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.accountlimit.AccountLimit;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class AccountLimitInformRequest extends ContentRequest {

    @JsonProperty("limit")
    private AccountLimit limit;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    public static Builder newBuilder() {
        return new Builder();
    }

    public AccountLimit getLimit() {
        return this.limit;
    }

    public void setLimit(AccountLimit value) {
        this.limit = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public static class Builder {

        private final AccountLimitInformRequest instance = new AccountLimitInformRequest();

        private Builder() {
        }

        public AccountLimitInformRequest build() {
            return this.instance;
        }

        public Builder setLimit(AccountLimit value) {
            this.instance.setLimit(value);
            return this;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }
    }
}

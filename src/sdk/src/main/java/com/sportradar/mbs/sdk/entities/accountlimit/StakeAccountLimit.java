package com.sportradar.mbs.sdk.entities.accountlimit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.Amount;

public class StakeAccountLimit extends AccountLimit {

    @JsonProperty("period")
    private AccountLimitPeriod period;
    @JsonProperty("amount")
    private Amount amount;

    public static Builder newBuilder() {
        return new Builder();
    }

    public AccountLimitPeriod getPeriod() {
        return this.period;
    }

    public void setPeriod(AccountLimitPeriod value) {
        this.period = value;
    }

    public Amount getAmount() {
        return this.amount;
    }

    public void setAmount(Amount value) {
        this.amount = value;
    }

    public static class Builder {

        private final StakeAccountLimit instance = new StakeAccountLimit();

        private Builder() {
        }

        public StakeAccountLimit build() {
            return this.instance;
        }

        public Builder setPeriod(AccountLimitPeriod value) {
            this.instance.setPeriod(value);
            return this;
        }

        public Builder setAmount(Amount value) {
            this.instance.setAmount(value);
            return this;
        }
    }
}

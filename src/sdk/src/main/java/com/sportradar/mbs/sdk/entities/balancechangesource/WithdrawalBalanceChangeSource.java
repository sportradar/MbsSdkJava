package com.sportradar.mbs.sdk.entities.balancechangesource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WithdrawalBalanceChangeSource extends BalanceChangeSource {

    @JsonProperty("id")
    private String id;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public static class Builder {

        private final WithdrawalBalanceChangeSource instance = new WithdrawalBalanceChangeSource();

        private Builder() {
        }

        public WithdrawalBalanceChangeSource build() {
            return this.instance;
        }

        public Builder setId(String value) {
            this.instance.setId(value);
            return this;
        }
    }
}

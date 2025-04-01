package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.balancechangesource.BalanceChangeSource;
import com.sportradar.mbs.sdk.entities.common.Amount;
import com.sportradar.mbs.sdk.entities.common.BalanceChangeStatus;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class BalanceChangeInformRequest extends ContentRequest {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("balanceChangeId")
    private String balanceChangeId;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("executedAtUtc")
    private long executedAtUtc;
    @JsonProperty("source")
    private BalanceChangeSource source;
    @JsonProperty("status")
    private BalanceChangeStatus status;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWalletId() {
        return this.walletId;
    }

    public void setWalletId(String value) {
        this.walletId = value;
    }

    public String getBalanceChangeId() {
        return this.balanceChangeId;
    }

    public void setBalanceChangeId(String value) {
        this.balanceChangeId = value;
    }

    public Amount getAmount() {
        return this.amount;
    }

    public void setAmount(Amount value) {
        this.amount = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public long getExecutedAtUtc() {
        return this.executedAtUtc;
    }

    public void setExecutedAtUtc(long value) {
        this.executedAtUtc = value;
    }

    public BalanceChangeSource getSource() {
        return this.source;
    }

    public void setSource(BalanceChangeSource value) {
        this.source = value;
    }

    public BalanceChangeStatus getStatus() {
        return this.status;
    }

    public void setStatus(BalanceChangeStatus value) {
        this.status = value;
    }

    public static class Builder {

        private final BalanceChangeInformRequest instance = new BalanceChangeInformRequest();

        private Builder() {
        }

        public BalanceChangeInformRequest build() {
            return this.instance;
        }

        public Builder setWalletId(String value) {
            this.instance.setWalletId(value);
            return this;
        }

        public Builder setBalanceChangeId(String value) {
            this.instance.setBalanceChangeId(value);
            return this;
        }

        public Builder setAmount(Amount value) {
            this.instance.setAmount(value);
            return this;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        public Builder setExecutedAtUtc(long value) {
            this.instance.setExecutedAtUtc(value);
            return this;
        }

        public Builder setSource(BalanceChangeSource value) {
            this.instance.setSource(value);
            return this;
        }

        public Builder setStatus(BalanceChangeStatus value) {
            this.instance.setStatus(value);
            return this;
        }
    }
}

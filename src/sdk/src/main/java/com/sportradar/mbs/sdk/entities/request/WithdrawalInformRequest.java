package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.Amount;
import com.sportradar.mbs.sdk.entities.common.BalanceMoveStatus;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.sportradar.mbs.sdk.entities.common.PaymentGateway;

public class WithdrawalInformRequest extends ContentRequest {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("withdrawalId")
    private String withdrawalId;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("executedAtUtc")
    private long executedAtUtc;
    @JsonProperty("initiatedAtUtc")
    private Long initiatedAtUtc;
    @JsonProperty("gateway")
    private PaymentGateway gateway;
    @JsonProperty("status")
    private BalanceMoveStatus status;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWalletId() {
        return this.walletId;
    }

    public void setWalletId(String value) {
        this.walletId = value;
    }

    public String getWithdrawalId() {
        return this.withdrawalId;
    }

    public void setWithdrawalId(String value) {
        this.withdrawalId = value;
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

    public Long getInitiatedAtUtc() {
        return this.initiatedAtUtc;
    }

    public void setInitiatedAtUtc(Long value) {
        this.initiatedAtUtc = value;
    }

    public PaymentGateway getGateway() {
        return this.gateway;
    }

    public void setGateway(PaymentGateway value) {
        this.gateway = value;
    }

    public BalanceMoveStatus getStatus() {
        return this.status;
    }

    public void setStatus(BalanceMoveStatus value) {
        this.status = value;
    }

    public static class Builder {

        private final WithdrawalInformRequest instance = new WithdrawalInformRequest();

        private Builder() {
        }

        public WithdrawalInformRequest build() {
            return this.instance;
        }

        public Builder setWalletId(String value) {
            this.instance.setWalletId(value);
            return this;
        }

        public Builder setWithdrawalId(String value) {
            this.instance.setWithdrawalId(value);
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

        public Builder setInitiatedAtUtc(Long value) {
            this.instance.setInitiatedAtUtc(value);
            return this;
        }

        public Builder setGateway(PaymentGateway value) {
            this.instance.setGateway(value);
            return this;
        }

        public Builder setStatus(BalanceMoveStatus value) {
            this.instance.setStatus(value);
            return this;
        }
    }
}

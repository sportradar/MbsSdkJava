package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.AccountStatus;
import com.sportradar.mbs.sdk.entities.common.AccountStatusChangeDuration;
import com.sportradar.mbs.sdk.entities.common.AccountStatusChangeInitiator;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class AccountStatusInformRequest extends ContentRequest {

    @JsonProperty("duration")
    private AccountStatusChangeDuration duration;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("initiator")
    private AccountStatusChangeInitiator initiator;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("periodStartUtc")
    private long periodStartUtc;
    @JsonProperty("status")
    private AccountStatus status;
    @JsonProperty("periodEndUtc")
    private Long periodEndUtc;

    public static Builder newBuilder() {
        return new Builder();
    }

    public AccountStatusChangeDuration getDuration() {
        return this.duration;
    }

    public void setDuration(AccountStatusChangeDuration value) {
        this.duration = value;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String value) {
        this.reason = value;
    }

    public AccountStatusChangeInitiator getInitiator() {
        return this.initiator;
    }

    public void setInitiator(AccountStatusChangeInitiator value) {
        this.initiator = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public long getPeriodStartUtc() {
        return this.periodStartUtc;
    }

    public void setPeriodStartUtc(long value) {
        this.periodStartUtc = value;
    }

    public AccountStatus getStatus() {
        return this.status;
    }

    public void setStatus(AccountStatus value) {
        this.status = value;
    }

    public Long getPeriodEndUtc() {
        return this.periodEndUtc;
    }

    public void setPeriodEndUtc(Long value) {
        this.periodEndUtc = value;
    }

    public static class Builder {

        private final AccountStatusInformRequest instance = new AccountStatusInformRequest();

        private Builder() {
        }

        public AccountStatusInformRequest build() {
            return this.instance;
        }

        public Builder setDuration(AccountStatusChangeDuration value) {
            this.instance.setDuration(value);
            return this;
        }

        public Builder setReason(String value) {
            this.instance.setReason(value);
            return this;
        }

        public Builder setInitiator(AccountStatusChangeInitiator value) {
            this.instance.setInitiator(value);
            return this;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        public Builder setPeriodStartUtc(long value) {
            this.instance.setPeriodStartUtc(value);
            return this;
        }

        public Builder setStatus(AccountStatus value) {
            this.instance.setStatus(value);
            return this;
        }

        public Builder setPeriodEndUtc(Long value) {
            this.instance.setPeriodEndUtc(value);
            return this;
        }
    }
}

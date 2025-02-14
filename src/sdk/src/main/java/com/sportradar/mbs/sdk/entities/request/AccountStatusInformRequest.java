package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.sportradar.mbs.sdk.entities.common.StatusDuration;
import com.sportradar.mbs.sdk.entities.common.StatusValue;
import com.sportradar.mbs.sdk.entities.common.Initiator;

/**
 * Represents a request to inform about an account status update.
 */
public class AccountStatusInformRequest extends ContentRequest {

    @JsonProperty("duration")
    private StatusDuration duration;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("initiator")
    private Initiator initiator;

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    @JsonProperty("periodStartUtc")
    private long periodStartUtc;

    @JsonProperty("status")
    private StatusValue status;

    @JsonProperty("periodEndUtc")
    private Long periodEndUtc;

    /**
     * Retrieves the duration of the status.
     *
     * @return the duration of the status.
     */
    public StatusDuration getDuration() {
        return this.duration;
    }

    /**
     * Sets the duration of the status.
     *
     * @param value the duration to set.
     */
    public void setDuration(StatusDuration value) {
        this.duration = value;
    }

    /**
     * Retrieves the reason for the status change.
     *
     * @return the reason for the status change.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Sets the reason for the status change.
     *
     * @param value the reason to set.
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Retrieves the initiator of the status change.
     *
     * @return the initiator of the status change.
     */
    public Initiator getInitiator() {
        return this.initiator;
    }

    /**
     * Sets the initiator of the status change.
     *
     * @param value the initiator to set.
     */
    public void setInitiator(Initiator value) {
        this.initiator = value;
    }

    /**
     * Retrieves the end customer associated with the status update.
     *
     * @return the end customer information.
     */
    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    /**
     * Sets the end customer information.
     *
     * @param value the end customer to set.
     */
    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    /**
     * Retrieves the UTC start time of the period.
     *
     * @return the start time in UTC as a long value.
     */
    public long getPeriodStartUtc() {
        return this.periodStartUtc;
    }

    /**
     * Sets the UTC start time of the period.
     *
     * @param value the start time to set in UTC.
     */
    public void setPeriodStartUtc(long value) {
        this.periodStartUtc = value;
    }

    /**
     * Retrieves the status value of the account.
     *
     * @return the status value.
     */
    public StatusValue getStatus() {
        return this.status;
    }

    /**
     * Sets the status value of the account.
     *
     * @param value the status to set.
     */
    public void setStatus(StatusValue value) {
        this.status = value;
    }

    /**
     * Retrieves the UTC end time of the period.
     *
     * @return the end time in UTC as a Long value, or null if not set.
     */
    public Long getPeriodEndUtc() {
        return this.periodEndUtc;
    }

    /**
     * Sets the UTC end time of the period.
     *
     * @param value the end time to set in UTC.
     */
    public void setPeriodEndUtc(Long value) {
        this.periodEndUtc = value;
    }

    /**
     * Creates a new builder instance for constructing an {@code AccountStatusInformRequest} object.
     *
     * @return a new Builder instance.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for constructing {@code AccountStatusInformRequest} instances.
     */
    public static class Builder {
        private final AccountStatusInformRequest instance = new AccountStatusInformRequest();

        private Builder() { /* Prevent external instantiation */ }

        /**
         * Builds and returns the constructed {@code AccountStatusInformRequest} instance.
         *
         * @return the constructed instance.
         */
        public AccountStatusInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the duration value in the builder.
         *
         * @param value the duration to set.
         * @return the builder instance.
         */
        public Builder setDuration(StatusDuration value) {
            this.instance.setDuration(value);
            return this;
        }

        /**
         * Sets the reason for the status change in the builder.
         *
         * @param value the reason to set.
         * @return the builder instance.
         */
        public Builder setReason(String value) {
            this.instance.setReason(value);
            return this;
        }

        /**
         * Sets the initiator of the status change in the builder.
         *
         * @param value the initiator to set.
         * @return the builder instance.
         */
        public Builder setInitiator(Initiator value) {
            this.instance.setInitiator(value);
            return this;
        }

        /**
         * Sets the end customer associated with the status update in the builder.
         *
         * @param value the end customer to set.
         * @return the builder instance.
         */
        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the UTC start time of the period in the builder.
         *
         * @param value the start time to set in UTC.
         * @return the builder instance.
         */
        public Builder setPeriodStartUtc(long value) {
            this.instance.setPeriodStartUtc(value);
            return this;
        }

        /**
         * Sets the status value of the account in the builder.
         *
         * @param value the status to set.
         * @return the builder instance.
         */
        public Builder setStatus(StatusValue value) {
            this.instance.setStatus(value);
            return this;
        }

        /**
         * Sets the UTC end time of the period in the builder.
         *
         * @param value the end time to set in UTC.
         * @return the builder instance.
         */
        public Builder setPeriodEndUtc(Long value) {
            this.instance.setPeriodEndUtc(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.request;

import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.sportradar.mbs.sdk.entities.common.FinancialLimitType;
import com.sportradar.mbs.sdk.entities.common.LimitFrequency;
import com.sportradar.mbs.sdk.entities.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request to inform about a financial limit for an end customer.
 */
public class FinancialLimitInformRequest extends ContentRequest {

    /**
     * The financial amount associated with the limit.
     */
    @JsonProperty("amount")
    private Amount amount;

    /**
     * Information about the end customer.
     */
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    /**
     * The type of financial limit being informed about.
     */
    @JsonProperty("limitType")
    private FinancialLimitType limitType;

    /**
     * The frequency of the limit enforcement.
     */
    @JsonProperty("frequency")
    private LimitFrequency frequency;

    /**
     * Retrieves the financial amount associated with the limit.
     *
     * @return the amount instance
     */
    public Amount getAmount() {
        return this.amount;
    }

    /**
     * Sets the financial amount associated with the limit.
     *
     * @param value the amount instance
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Retrieves the end customer information.
     *
     * @return the end customer instance
     */
    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    /**
     * Sets the end customer information.
     *
     * @param value the end customer instance
     */
    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    /**
     * Retrieves the type of financial limit.
     *
     * @return the financial limit type instance
     */
    public FinancialLimitType getLimitType() {
        return this.limitType;
    }

    /**
     * Sets the type of financial limit.
     *
     * @param value the financial limit type instance
     */
    public void setLimitType(FinancialLimitType value) {
        this.limitType = value;
    }

    /**
     * Retrieves the frequency of the financial limit enforcement.
     *
     * @return the frequency instance
     */
    public LimitFrequency getFrequency() {
        return this.frequency;
    }

    /**
     * Sets the frequency of the financial limit enforcement.
     *
     * @param value the frequency instance
     */
    public void setFrequency(LimitFrequency value) {
        this.frequency = value;
    }

    /**
     * Creates a new builder instance for constructing a {@code FinancialLimitInformRequest}.
     *
     * @return a new Builder instance
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for {@code FinancialLimitInformRequest} to facilitate object creation.
     */
    public static class Builder {

        /**
         * Instance of {@code FinancialLimitInformRequest} being built.
         */
        private final FinancialLimitInformRequest instance = new FinancialLimitInformRequest();

        /**
         * Private constructor to enforce the use of {@code newBuilder()}.
         */
        private Builder() {
        }

        /**
         * Builds and returns the {@code FinancialLimitInformRequest} instance.
         *
         * @return the constructed {@code FinancialLimitInformRequest} instance
         */
        public FinancialLimitInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the financial amount associated with the limit.
         *
         * @param value the amount instance
         * @return the builder instance
         */
        public Builder setAmount(Amount value) {
            this.instance.setAmount(value);
            return this;
        }

        /**
         * Sets the end customer information.
         *
         * @param value the end customer instance
         * @return the builder instance
         */
        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the type of financial limit.
         *
         * @param value the financial limit type instance
         * @return the builder instance
         */
        public Builder setLimitType(FinancialLimitType value) {
            this.instance.setLimitType(value);
            return this;
        }

        /**
         * Sets the frequency of the financial limit enforcement.
         *
         * @param value the frequency instance
         * @return the builder instance
         */
        public Builder setFrequency(LimitFrequency value) {
            this.instance.setFrequency(value);
            return this;
        }
    }
}

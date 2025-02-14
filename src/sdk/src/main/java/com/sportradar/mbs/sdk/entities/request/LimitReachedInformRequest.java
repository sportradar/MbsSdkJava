package com.sportradar.mbs.sdk.entities.request;

import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.sportradar.mbs.sdk.entities.common.LimitType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request to inform that a limit has been reached for an end customer.
 */
public class LimitReachedInformRequest extends ContentRequest {

    /**
     * Information about the end customer.
     */
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    /**
     * The type of limit that has been reached.
     */
    @JsonProperty("limitType")
    private LimitType limitType;

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
     * Retrieves the type of limit that has been reached.
     *
     * @return the limit type instance
     */
    public LimitType getLimitType() {
        return this.limitType;
    }

    /**
     * Sets the type of limit that has been reached.
     *
     * @param value the limit type instance
     */
    public void setLimitType(LimitType value) {
        this.limitType = value;
    }

    /**
     * Creates a new builder instance for constructing a {@code LimitReachedInformRequest}.
     *
     * @return a new Builder instance
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for {@code LimitReachedInformRequest} to facilitate object creation.
     */
    public static class Builder {

        /**
         * Instance of {@code LimitReachedInformRequest} being built.
         */
        private final LimitReachedInformRequest instance = new LimitReachedInformRequest();

        /**
         * Private constructor to enforce the use of {@code newBuilder()}.
         */
        private Builder() {
        }

        /**
         * Builds and returns the {@code LimitReachedInformRequest} instance.
         *
         * @return the constructed {@code LimitReachedInformRequest} instance
         */
        public LimitReachedInformRequest build() {
            return this.instance;
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
         * Sets the type of limit that has been reached.
         *
         * @param value the limit type instance
         * @return the builder instance
         */
        public Builder setLimitType(LimitType value) {
            this.instance.setLimitType(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.request;

import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request to inform about session limits for an end customer.
 */
public class SessionLimitInformRequest extends ContentRequest {

    /**
     * Duration of the session in seconds.
     */
    @JsonProperty("duration")
    private int duration;

    /**
     * Information about the end customer.
     */
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    /**
     * Retrieves the duration of the session.
     *
     * @return the session duration in seconds
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * Sets the duration of the session.
     *
     * @param value the duration in seconds
     */
    public void setDuration(int value) {
        this.duration = value;
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
     * Creates a new builder instance for constructing a {@code SessionLimitInformRequest}.
     *
     * @return a new Builder instance
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for {@code SessionLimitInformRequest} to facilitate object creation.
     */
    public static class Builder {

        /**
         * Instance of {@code SessionLimitInformRequest} being built.
         */
        private final SessionLimitInformRequest instance = new SessionLimitInformRequest();

        /**
         * Private constructor to enforce the use of {@code newBuilder()}.
         */
        private Builder() {
        }

        /**
         * Builds and returns the {@code SessionLimitInformRequest} instance.
         *
         * @return the constructed {@code SessionLimitInformRequest} instance
         */
        public SessionLimitInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the duration of the session.
         *
         * @param value the duration in seconds
         * @return the builder instance
         */
        public Builder setDuration(int value) {
            this.instance.setDuration(value);
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
    }
}

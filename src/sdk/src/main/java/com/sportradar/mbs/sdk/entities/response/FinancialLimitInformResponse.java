package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response for a financial limit inform request.
 */
public class FinancialLimitInformResponse extends ContentResponse {

    /**
     * Response code indicating the status of the request.
     */
    @JsonProperty("code")
    private int code;

    /**
     * Retrieves the response code.
     *
     * @return the response code
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Sets the response code.
     *
     * @param value the response code
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Digital signature for verifying response authenticity.
     */
    @JsonProperty("signature")
    private String signature;

    /**
     * Retrieves the digital signature.
     *
     * @return the signature string
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * Sets the digital signature.
     *
     * @param value the signature string
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Response message providing additional details.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Retrieves the response message.
     *
     * @return the response message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the response message.
     *
     * @param value the response message
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Creates a new builder instance for constructing a {@code FinancialLimitInformResponse}.
     *
     * @return a new Builder instance
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for {@code FinancialLimitInformResponse} to facilitate object creation.
     */
    public static class Builder {

        /**
         * Instance of {@code FinancialLimitInformResponse} being built.
         */
        private final FinancialLimitInformResponse instance = new FinancialLimitInformResponse();

        /**
         * Private constructor to enforce the use of {@code newBuilder()}.
         */
        private Builder() {
        }

        /**
         * Builds and returns the {@code FinancialLimitInformResponse} instance.
         *
         * @return the constructed {@code FinancialLimitInformResponse} instance
         */
        public FinancialLimitInformResponse build() {
            return this.instance;
        }

        /**
         * Sets the response code.
         *
         * @param value the response code
         * @return the builder instance
         */
        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        /**
         * Sets the digital signature.
         *
         * @param value the signature string
         * @return the builder instance
         */
        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }

        /**
         * Sets the response message.
         *
         * @param value the response message
         * @return the builder instance
         */
        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

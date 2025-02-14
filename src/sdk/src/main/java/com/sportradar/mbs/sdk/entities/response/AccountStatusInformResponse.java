package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response entity for account status information.
 * This class extends ContentResponse and contains fields for status code,
 * signature, and message, which are annotated for JSON serialization.
 */
public class AccountStatusInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code; // Status code of the response

    @JsonProperty("signature")
    private String signature; // Signature for authentication or verification

    @JsonProperty("message")
    private String message; // Response message providing additional details

    /**
     * Retrieves the status code.
     *
     * @return the response code
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Sets the status code.
     *
     * @param value the status code to set
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Retrieves the signature.
     *
     * @return the signature string
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * Sets the signature.
     *
     * @param value the signature to set
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Retrieves the response message.
     *
     * @return the message string
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the response message.
     *
     * @param value the message to set
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Creates a new builder instance for constructing an AccountStatusInformResponse object.
     *
     * @return a new Builder instance
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for AccountStatusInformResponse.
     * Provides a fluent interface for constructing instances of the outer class.
     */
    public static class Builder {
        private final AccountStatusInformResponse instance = new AccountStatusInformResponse();

        /**
         * Private constructor to prevent instantiation from outside.
         */
        private Builder() {
        }

        /**
         * Builds and returns the configured AccountStatusInformResponse instance.
         *
         * @return the built instance
         */
        public AccountStatusInformResponse build() {
            return this.instance;
        }

        /**
         * Sets the status code in the response object.
         *
         * @param value the status code to set
         * @return the Builder instance for method chaining
         */
        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        /**
         * Sets the signature in the response object.
         *
         * @param value the signature to set
         * @return the Builder instance for method chaining
         */
        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }

        /**
         * Sets the message in the response object.
         *
         * @param value the message to set
         * @return the Builder instance for method chaining
         */
        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

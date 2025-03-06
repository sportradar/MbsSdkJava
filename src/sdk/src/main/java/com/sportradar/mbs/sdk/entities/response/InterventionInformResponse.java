package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response entity for an intervention inform request.
 * This class extends ContentResponse and includes a code, signature, and message.
 */
public class InterventionInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code; // Status code of the response

    @JsonProperty("signature")
    private String signature; // Digital signature for verification

    @JsonProperty("message")
    private String message; // Descriptive message regarding the intervention

    /**
     * Gets the response code.
     *
     * @return The response code.
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Sets the response code.
     *
     * @param value The response code to set.
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the digital signature.
     *
     * @return The digital signature.
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * Sets the digital signature.
     *
     * @param value The signature to set.
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the response message.
     *
     * @return The response message.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the response message.
     *
     * @param value The message to set.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Creates a new Builder instance for constructing an InterventionInformResponse object.
     *
     * @return A new Builder instance.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for creating instances of InterventionInformResponse.
     */
    public static class Builder {

        private final InterventionInformResponse instance = new InterventionInformResponse();

        /**
         * Private constructor to prevent direct instantiation.
         */
        private Builder() {
        }

        /**
         * Builds and returns the InterventionInformResponse object.
         *
         * @return The constructed InterventionInformResponse object.
         */
        public InterventionInformResponse build() {
            return this.instance;
        }

        /**
         * Sets the response code in the builder instance.
         *
         * @param value The response code to set.
         * @return The Builder instance for method chaining.
         */
        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        /**
         * Sets the signature in the builder instance.
         *
         * @param value The signature to set.
         * @return The Builder instance for method chaining.
         */
        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }

        /**
         * Sets the response message in the builder instance.
         *
         * @param value The message to set.
         * @return The Builder instance for method chaining.
         */
        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

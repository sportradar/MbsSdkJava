package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a response object for deposit information.
 */
public class DepositInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;

    @JsonProperty("signature")
    private String signature; // Signature for authentication or verification

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
     * Creates a new instance of DepositInformResponse.Builder.
     *
     * @return A new instance of DepositInformResponse.Builder.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Gets the code associated with the deposit inform response.
     *
     * @return The code associated with the deposit inform response.
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Sets the code associated with the deposit inform response.
     *
     * @param value The code to set.
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the message associated with the deposit inform response.
     *
     * @return The message associated with the deposit inform response.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the message associated with the deposit inform response.
     *
     * @param value The message to set.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Builder class for creating instances of DepositInformResponse.
     */
    public static class Builder {

        private final DepositInformResponse instance = new DepositInformResponse();

        private Builder() {
        }

        /**
         * Builds the DepositInformResponse object.
         *
         * @return The built DepositInformResponse object.
         */
        public DepositInformResponse build() {
            return this.instance;
        }

        /**
         * Sets the code for the DepositInformResponse object being built.
         *
         * @param value The code to set.
         * @return The Builder instance.
         */
        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        /**
         * Sets the signature.
         *
         * @param value the signature to set
         */
        public void setSignature(String value) {
            this.instance.signature = value;
        }

        /**
         * Sets the message for the DepositInformResponse object being built.
         *
         * @param value The message to set.
         * @return The Builder instance.
         */
        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

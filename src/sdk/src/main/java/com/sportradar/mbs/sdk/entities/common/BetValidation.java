package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a BetValidation object that contains information about a bet validation.
 */
public class BetValidation {

    @JsonProperty("code")
    private int code;
    @JsonProperty("betId")
    private String betId;
    @JsonProperty("message")
    private String message;
    @JsonProperty("rejected")
    private Boolean rejected;

    /**
     * Creates a new instance of the BetValidation class.
     *
     * @return A new instance of the BetValidation class.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Gets the code of the bet validation.
     *
     * @return The code of the bet validation.
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Sets the code of the bet validation.
     *
     * @param value The code of the bet validation.
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the bet ID of the bet validation.
     *
     * @return The bet ID of the bet validation.
     */
    public String getBetId() {
        return this.betId;
    }

    /**
     * Sets the bet ID of the bet validation.
     *
     * @param value The bet ID of the bet validation.
     */
    public void setBetId(String value) {
        this.betId = value;
    }

    /**
     * Gets the message of the bet validation.
     *
     * @return The message of the bet validation.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the message of the bet validation.
     *
     * @param value The message of the bet validation.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the rejected boolean value of the bet validation.
     *
     * @return The rejected boolean value of the bet validation.
     */
    public Boolean isRejected() {
        return rejected;
    }

    /**
     * Sets the rejected boolean value of the bet validation.
     *
     * @param rejected The rejected boolean value of the bet validation.
     */
    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    /**
     * Represents a builder for the BetValidation class.
     */
    public static class Builder {

        private final BetValidation instance = new BetValidation();

        private Builder() {
        }

        /**
         * Builds the BetValidation object.
         *
         * @return The built BetValidation object.
         */
        public BetValidation build() {
            return this.instance;
        }

        /**
         * Sets the code of the bet validation.
         *
         * @param value The code of the bet validation.
         * @return The builder instance.
         */
        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        /**
         * Sets the bet ID of the bet validation.
         *
         * @param value The bet ID of the bet validation.
         * @return The builder instance.
         */
        public Builder setBetId(String value) {
            this.instance.setBetId(value);
            return this;
        }

        /**
         * Sets the message of the bet validation.
         *
         * @param value The message of the bet validation.
         * @return The builder instance.
         */
        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }

        /**
         * Sets the rejected boolean value of the bet validation.
         *
         * @param value The rejected boolean value of the bet validation.
         * @return The builder instance.
         */
        public Builder setRejected(Boolean value) {
            this.instance.setRejected(value);
            return this;
        }
    }
}

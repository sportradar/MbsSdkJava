package com.sportradar.mbs.sdk.entities.request;

import com.sportradar.mbs.sdk.entities.common.Method;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request entity for an intervention inform request.
 * This class extends ContentRequest and includes method, model initiation flag, end customer, and a comment.
 */
public class InterventionInformRequest extends ContentRequest {

    @JsonProperty("method")
    private Method method; // The method associated with the intervention request

    @JsonProperty("modelInitiated")
    private boolean modelInitiated; // Flag indicating if the model initiated the request

    @JsonProperty("endCustomer")
    private EndCustomer endCustomer; // Details of the end customer involved in the request

    @JsonProperty("comment")
    private String comment; // Additional comment or description related to the request

    /**
     * Gets the method associated with the request.
     *
     * @return The method of the request.
     */
    public Method getMethod() {
        return this.method;
    }

    /**
     * Sets the method for the request.
     *
     * @param value The method to set.
     */
    public void setMethod(Method value) {
        this.method = value;
    }

    /**
     * Gets the model initiated flag.
     *
     * @return True if the model initiated the request, false otherwise.
     */
    public boolean getModelInitiated() {
        return this.modelInitiated;
    }

    /**
     * Sets whether the model initiated the request.
     *
     * @param value True if the model initiated the request, false otherwise.
     */
    public void setModelInitiated(boolean value) {
        this.modelInitiated = value;
    }

    /**
     * Gets the end customer associated with the request.
     *
     * @return The end customer details.
     */
    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    /**
     * Sets the end customer details for the request.
     *
     * @param value The end customer to set.
     */
    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    /**
     * Gets the comment associated with the request.
     *
     * @return The request comment.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Sets the comment for the request.
     *
     * @param value The comment to set.
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Creates a new Builder instance for constructing an InterventionInformRequest object.
     *
     * @return A new Builder instance.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder class for creating instances of InterventionInformRequest.
     */
    public static class Builder {

        private final InterventionInformRequest instance = new InterventionInformRequest();

        /**
         * Private constructor to prevent direct instantiation.
         */
        private Builder() {
        }

        /**
         * Builds and returns the InterventionInformRequest object.
         *
         * @return The constructed InterventionInformRequest object.
         */
        public InterventionInformRequest build() {
            return this.instance;
        }

        /**
         * Sets the method in the builder instance.
         *
         * @param value The method to set.
         * @return The Builder instance for method chaining.
         */
        public Builder setMethod(Method value) {
            this.instance.setMethod(value);
            return this;
        }

        /**
         * Sets the model initiation flag in the builder instance.
         *
         * @param value The model initiation flag to set.
         * @return The Builder instance for method chaining.
         */
        public Builder setModelInitiated(boolean value) {
            this.instance.setModelInitiated(value);
            return this;
        }

        /**
         * Sets the end customer in the builder instance.
         *
         * @param value The end customer to set.
         * @return The Builder instance for method chaining.
         */
        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        /**
         * Sets the comment in the builder instance.
         *
         * @param value The comment to set.
         * @return The Builder instance for method chaining.
         */
        public Builder setComment(String value) {
            this.instance.setComment(value);
            return this;
        }
    }
}

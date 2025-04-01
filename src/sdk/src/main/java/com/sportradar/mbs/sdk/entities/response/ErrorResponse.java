package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse extends ContentResponse {

    @JsonProperty("message")
    private String errorMessage;
    @JsonProperty("code")
    private int errorCode;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    public static class Builder {

        private final ErrorResponse instance = new ErrorResponse();

        private Builder() {
        }

        public ErrorResponse build() {
            return this.instance;
        }

        public Builder setErrorMessage(String value) {
            this.instance.setErrorMessage(value);
            return this;
        }

        public Builder setErrorCode(int value) {
            this.instance.setErrorCode(value);
            return this;
        }
    }
}

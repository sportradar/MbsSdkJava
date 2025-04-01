package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CashoutInformValidation {

    @JsonProperty("code")
    private int code;
    @JsonProperty("rejected")
    private boolean rejected;
    @JsonProperty("message")
    private String message;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int value) {
        this.code = value;
    }

    public boolean getRejected() {
        return this.rejected;
    }

    public void setRejected(boolean value) {
        this.rejected = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public static class Builder {

        private final CashoutInformValidation instance = new CashoutInformValidation();

        private Builder() {
        }

        public CashoutInformValidation build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setRejected(boolean value) {
            this.instance.setRejected(value);
            return this;
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

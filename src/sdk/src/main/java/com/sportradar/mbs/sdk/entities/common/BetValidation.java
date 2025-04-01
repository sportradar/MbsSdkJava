package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetValidation {

    @JsonProperty("code")
    private int code;
    @JsonProperty("rejected")
    private boolean rejected;
    @JsonProperty("betId")
    private String betId;
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

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String value) {
        this.betId = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public static class Builder {

        private final BetValidation instance = new BetValidation();

        private Builder() {
        }

        public BetValidation build() {
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

        public Builder setBetId(String value) {
            this.instance.setBetId(value);
            return this;
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

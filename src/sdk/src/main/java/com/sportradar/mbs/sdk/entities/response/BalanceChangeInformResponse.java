package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BalanceChangeInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("signature")
    private String signature;
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

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String value) {
        this.signature = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public static class Builder {

        private final BalanceChangeInformResponse instance = new BalanceChangeInformResponse();

        private Builder() {
        }

        public BalanceChangeInformResponse build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

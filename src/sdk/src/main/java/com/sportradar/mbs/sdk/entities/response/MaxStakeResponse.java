package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.Bet;

import java.util.List;

public class MaxStakeResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("bets")
    private Bet[] bets;
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

    public Bet[] getBets() {
        return this.bets;
    }

    public void setBets(Bet[] value) {
        this.bets = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public static class Builder {

        private final MaxStakeResponse instance = new MaxStakeResponse();

        private Builder() {
        }

        public MaxStakeResponse build() {
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

        public Builder setBets(Bet... value) {
            this.instance.setBets(value);
            return this;
        }

        public Builder setBets(List<? extends Bet> value) {
            Bet[] arr = value == null ? null : value.toArray(new Bet[0]);
            return this.setBets(arr);
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

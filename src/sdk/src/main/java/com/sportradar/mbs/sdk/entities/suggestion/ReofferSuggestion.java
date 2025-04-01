package com.sportradar.mbs.sdk.entities.suggestion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.stake.Stake;

import java.util.List;

public class ReofferSuggestion extends Suggestion {

    @JsonProperty("mode")
    private String mode;
    @JsonProperty("stake")
    private Stake[] stake;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMode() {
        return this.mode;
    }

    public void setMode(String value) {
        this.mode = value;
    }

    public Stake[] getStake() {
        return this.stake;
    }

    public void setStake(Stake[] value) {
        this.stake = value;
    }

    public static class Builder {

        private final ReofferSuggestion instance = new ReofferSuggestion();

        private Builder() {
        }

        public ReofferSuggestion build() {
            return this.instance;
        }

        public Builder setMode(String value) {
            this.instance.setMode(value);
            return this;
        }

        public Builder setStake(Stake... value) {
            this.instance.setStake(value);
            return this;
        }

        public Builder setStake(List<? extends Stake> value) {
            Stake[] arr = value == null ? null : value.toArray(new Stake[0]);
            return this.setStake(arr);
        }
    }
}

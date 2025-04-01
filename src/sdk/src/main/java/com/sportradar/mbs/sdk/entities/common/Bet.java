package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.selection.Selection;
import com.sportradar.mbs.sdk.entities.stake.Stake;

import java.util.List;

public class Bet {

    @JsonProperty("stake")
    private Stake[] stake;
    @JsonProperty("selections")
    private Selection[] selections;
    @JsonProperty("betId")
    private String betId;
    @JsonProperty("context")
    private BetContext context;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Stake[] getStake() {
        return this.stake;
    }

    public void setStake(Stake[] value) {
        this.stake = value;
    }

    public Selection[] getSelections() {
        return this.selections;
    }

    public void setSelections(Selection[] value) {
        this.selections = value;
    }

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String value) {
        this.betId = value;
    }

    public BetContext getContext() {
        return this.context;
    }

    public void setContext(BetContext value) {
        this.context = value;
    }

    public static class Builder {

        private final Bet instance = new Bet();

        private Builder() {
        }

        public Bet build() {
            return this.instance;
        }

        public Builder setStake(Stake... value) {
            this.instance.setStake(value);
            return this;
        }

        public Builder setStake(List<? extends Stake> value) {
            Stake[] arr = value == null ? null : value.toArray(new Stake[0]);
            return this.setStake(arr);
        }

        public Builder setSelections(Selection... value) {
            this.instance.setSelections(value);
            return this;
        }

        public Builder setSelections(List<? extends Selection> value) {
            Selection[] arr = value == null ? null : value.toArray(new Selection[0]);
            return this.setSelections(arr);
        }

        public Builder setBetId(String value) {
            this.instance.setBetId(value);
            return this;
        }

        public Builder setContext(BetContext value) {
            this.instance.setContext(value);
            return this;
        }
    }
}

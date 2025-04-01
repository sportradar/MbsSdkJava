package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

import java.util.List;

public class UfCustomBetSelection extends Selection {

    @JsonProperty("selections")
    private UfSelection[] selections;
    @JsonProperty("odds")
    private Odds odds;

    public static Builder newBuilder() {
        return new Builder();
    }

    public UfSelection[] getSelections() {
        return this.selections;
    }

    public void setSelections(UfSelection[] value) {
        this.selections = value;
    }

    public Odds getOdds() {
        return this.odds;
    }

    public void setOdds(Odds value) {
        this.odds = value;
    }

    public static class Builder {

        private final UfCustomBetSelection instance = new UfCustomBetSelection();

        private Builder() {
        }

        public UfCustomBetSelection build() {
            return this.instance;
        }

        public Builder setSelections(UfSelection... value) {
            this.instance.setSelections(value);
            return this;
        }

        public Builder setSelections(List<? extends UfSelection> value) {
            UfSelection[] arr = value == null ? null : value.toArray(new UfSelection[0]);
            return this.setSelections(arr);
        }

        public Builder setOdds(Odds value) {
            this.instance.setOdds(value);
            return this;
        }
    }
}

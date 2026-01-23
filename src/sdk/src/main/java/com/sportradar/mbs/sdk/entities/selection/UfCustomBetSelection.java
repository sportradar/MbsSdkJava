package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

import java.util.List;

public class UfCustomBetSelection extends Selection {

    @JsonProperty("selections")
    private UfSelection[] selections;
    @JsonProperty("odds")
    private Odds odds;
    @JsonProperty("harmOddsApplied")
    private Boolean harmOddsApplied;
    @JsonProperty("useHarmOdds")
    private boolean useHarmOdds;

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

    public Boolean getHarmOddsApplied() {
        return this.harmOddsApplied;
    }

    public void setHarmOddsApplied(Boolean value) {
        this.harmOddsApplied = value;
    }

    public boolean getUseHarmOdds() {
        return this.useHarmOdds;
    }

    public void setUseHarmOdds(boolean value) {
        this.useHarmOdds = value;
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

        public Builder setHarmOddsApplied(Boolean value) {
            this.instance.setHarmOddsApplied(value);
            return this;
        }

        public Builder setUseHarmOdds(boolean value) {
            this.instance.setUseHarmOdds(value);
            return this;
        }
    }
}

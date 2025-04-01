package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class OddsBoostSelection extends Selection {

    @JsonProperty("selection")
    private Selection selection;
    @JsonProperty("odds")
    private Odds odds;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Selection getSelection() {
        return this.selection;
    }

    public void setSelection(Selection value) {
        this.selection = value;
    }

    public Odds getOdds() {
        return this.odds;
    }

    public void setOdds(Odds value) {
        this.odds = value;
    }

    public static class Builder {

        private final OddsBoostSelection instance = new OddsBoostSelection();

        private Builder() {
        }

        public OddsBoostSelection build() {
            return this.instance;
        }

        public Builder setSelection(Selection value) {
            this.instance.setSelection(value);
            return this;
        }

        public Builder setOdds(Odds value) {
            this.instance.setOdds(value);
            return this;
        }
    }
}

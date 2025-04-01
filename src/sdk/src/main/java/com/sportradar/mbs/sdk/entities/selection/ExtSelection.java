package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class ExtSelection extends Selection {

    @JsonProperty("expSettleTime")
    private long expSettleTime;
    @JsonProperty("odds")
    private Odds odds;
    @JsonProperty("event")
    private String event;
    @JsonProperty("outcome")
    private String outcome;

    public static Builder newBuilder() {
        return new Builder();
    }

    public long getExpSettleTime() {
        return this.expSettleTime;
    }

    public void setExpSettleTime(long value) {
        this.expSettleTime = value;
    }

    public Odds getOdds() {
        return this.odds;
    }

    public void setOdds(Odds value) {
        this.odds = value;
    }

    public String getEvent() {
        return this.event;
    }

    public void setEvent(String value) {
        this.event = value;
    }

    public String getOutcome() {
        return this.outcome;
    }

    public void setOutcome(String value) {
        this.outcome = value;
    }

    public static class Builder {

        private final ExtSelection instance = new ExtSelection();

        private Builder() {
        }

        public ExtSelection build() {
            return this.instance;
        }

        public Builder setExpSettleTime(long value) {
            this.instance.setExpSettleTime(value);
            return this;
        }

        public Builder setOdds(Odds value) {
            this.instance.setOdds(value);
            return this;
        }

        public Builder setEvent(String value) {
            this.instance.setEvent(value);
            return this;
        }

        public Builder setOutcome(String value) {
            this.instance.setOutcome(value);
            return this;
        }
    }
}

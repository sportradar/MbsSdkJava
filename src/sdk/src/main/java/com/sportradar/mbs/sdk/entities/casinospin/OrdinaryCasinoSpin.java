package com.sportradar.mbs.sdk.entities.casinospin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdinaryCasinoSpin extends CasinoSpin {

    @JsonProperty("count")
    private int count;
    @JsonProperty("winningCount")
    private Integer winningCount;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int value) {
        this.count = value;
    }

    public Integer getWinningCount() {
        return this.winningCount;
    }

    public void setWinningCount(Integer value) {
        this.winningCount = value;
    }

    public static class Builder {

        private final OrdinaryCasinoSpin instance = new OrdinaryCasinoSpin();

        private Builder() {
        }

        public OrdinaryCasinoSpin build() {
            return this.instance;
        }

        public Builder setCount(int value) {
            this.instance.setCount(value);
            return this;
        }

        public Builder setWinningCount(Integer value) {
            this.instance.setWinningCount(value);
            return this;
        }
    }
}

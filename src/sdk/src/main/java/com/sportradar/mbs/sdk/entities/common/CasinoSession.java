package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.casinospin.CasinoSpin;
import com.sportradar.mbs.sdk.entities.payout.Payout;
import com.sportradar.mbs.sdk.entities.stake.Stake;

import java.util.List;

public class CasinoSession {

    @JsonProperty("stake")
    private Stake[] stake;
    @JsonProperty("game")
    private CasinoGame game;
    @JsonProperty("spins")
    private CasinoSpin[] spins;
    @JsonProperty("payout")
    private Payout[] payout;
    @JsonProperty("id")
    private String id;
    @JsonProperty("startUtc")
    private Long startUtc;
    @JsonProperty("endUtc")
    private Long endUtc;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Stake[] getStake() {
        return this.stake;
    }

    public void setStake(Stake[] value) {
        this.stake = value;
    }

    public CasinoGame getGame() {
        return this.game;
    }

    public void setGame(CasinoGame value) {
        this.game = value;
    }

    public CasinoSpin[] getSpins() {
        return this.spins;
    }

    public void setSpins(CasinoSpin[] value) {
        this.spins = value;
    }

    public Payout[] getPayout() {
        return this.payout;
    }

    public void setPayout(Payout[] value) {
        this.payout = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Long getStartUtc() {
        return this.startUtc;
    }

    public void setStartUtc(Long value) {
        this.startUtc = value;
    }

    public Long getEndUtc() {
        return this.endUtc;
    }

    public void setEndUtc(Long value) {
        this.endUtc = value;
    }

    public static class Builder {

        private final CasinoSession instance = new CasinoSession();

        private Builder() {
        }

        public CasinoSession build() {
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

        public Builder setGame(CasinoGame value) {
            this.instance.setGame(value);
            return this;
        }

        public Builder setSpins(CasinoSpin... value) {
            this.instance.setSpins(value);
            return this;
        }

        public Builder setSpins(List<? extends CasinoSpin> value) {
            CasinoSpin[] arr = value == null ? null : value.toArray(new CasinoSpin[0]);
            return this.setSpins(arr);
        }

        public Builder setPayout(Payout... value) {
            this.instance.setPayout(value);
            return this;
        }

        public Builder setPayout(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setPayout(arr);
        }

        public Builder setId(String value) {
            this.instance.setId(value);
            return this;
        }

        public Builder setStartUtc(Long value) {
            this.instance.setStartUtc(value);
            return this;
        }

        public Builder setEndUtc(Long value) {
            this.instance.setEndUtc(value);
            return this;
        }
    }
}

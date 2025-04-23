package com.sportradar.mbs.sdk.entities.probability;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class PushSelectionProbability extends SelectionProbability {

    @JsonProperty("halfWin")
    private BigDecimal halfWin;
    @JsonProperty("halfLose")
    private BigDecimal halfLose;
    @JsonProperty("win")
    private BigDecimal win;
    @JsonProperty("refund")
    private BigDecimal refund;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getHalfWin() {
        return this.halfWin;
    }

    public void setHalfWin(BigDecimal value) {
        this.halfWin = value;
    }

    public BigDecimal getHalfLose() {
        return this.halfLose;
    }

    public void setHalfLose(BigDecimal value) {
        this.halfLose = value;
    }

    public BigDecimal getWin() {
        return this.win;
    }

    public void setWin(BigDecimal value) {
        this.win = value;
    }

    public BigDecimal getRefund() {
        return this.refund;
    }

    public void setRefund(BigDecimal value) {
        this.refund = value;
    }

    public static class Builder {

        private final PushSelectionProbability instance = new PushSelectionProbability();

        private Builder() {
        }

        public PushSelectionProbability build() {
            return this.instance;
        }

        public Builder setHalfWin(BigDecimal value) {
            this.instance.setHalfWin(value);
            return this;
        }

        public Builder setHalfLose(BigDecimal value) {
            this.instance.setHalfLose(value);
            return this;
        }

        public Builder setWin(BigDecimal value) {
            this.instance.setWin(value);
            return this;
        }

        public Builder setRefund(BigDecimal value) {
            this.instance.setRefund(value);
            return this;
        }
    }
}

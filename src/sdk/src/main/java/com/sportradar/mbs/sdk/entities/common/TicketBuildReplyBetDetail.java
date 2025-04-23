package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

import java.math.BigDecimal;
import java.util.List;

public class TicketBuildReplyBetDetail {

    @JsonProperty("betId")
    private String betId;
    @JsonProperty("payout")
    private Payout[] payout;
    @JsonProperty("selectionDetails")
    private TicketBuildReplySelectionDetail[] selectionDetails;
    @JsonProperty("settledPercentage")
    private BigDecimal settledPercentage;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String value) {
        this.betId = value;
    }

    public Payout[] getPayout() {
        return this.payout;
    }

    public void setPayout(Payout[] value) {
        this.payout = value;
    }

    public TicketBuildReplySelectionDetail[] getSelectionDetails() {
        return this.selectionDetails;
    }

    public void setSelectionDetails(TicketBuildReplySelectionDetail[] value) {
        this.selectionDetails = value;
    }

    public BigDecimal getSettledPercentage() {
        return this.settledPercentage;
    }

    public void setSettledPercentage(BigDecimal value) {
        this.settledPercentage = value;
    }

    public static class Builder {

        private final TicketBuildReplyBetDetail instance = new TicketBuildReplyBetDetail();

        private Builder() {
        }

        public TicketBuildReplyBetDetail build() {
            return this.instance;
        }

        public Builder setBetId(String value) {
            this.instance.setBetId(value);
            return this;
        }

        public Builder setPayout(Payout... value) {
            this.instance.setPayout(value);
            return this;
        }

        public Builder setPayout(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setPayout(arr);
        }

        public Builder setSelectionDetails(TicketBuildReplySelectionDetail... value) {
            this.instance.setSelectionDetails(value);
            return this;
        }

        public Builder setSelectionDetails(List<? extends TicketBuildReplySelectionDetail> value) {
            TicketBuildReplySelectionDetail[] arr = value == null ? null : value.toArray(new TicketBuildReplySelectionDetail[0]);
            return this.setSelectionDetails(arr);
        }

        public Builder setSettledPercentage(BigDecimal value) {
            this.instance.setSettledPercentage(value);
            return this;
        }
    }
}

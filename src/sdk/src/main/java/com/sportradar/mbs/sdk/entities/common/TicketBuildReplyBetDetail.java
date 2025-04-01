package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TicketBuildReplyBetDetail {

    @JsonProperty("betId")
    private String betId;
    @JsonProperty("selectionDetails")
    private TicketBuildReplySelectionDetail[] selectionDetails;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String value) {
        this.betId = value;
    }

    public TicketBuildReplySelectionDetail[] getSelectionDetails() {
        return this.selectionDetails;
    }

    public void setSelectionDetails(TicketBuildReplySelectionDetail[] value) {
        this.selectionDetails = value;
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

        public Builder setSelectionDetails(TicketBuildReplySelectionDetail... value) {
            this.instance.setSelectionDetails(value);
            return this;
        }

        public Builder setSelectionDetails(List<? extends TicketBuildReplySelectionDetail> value) {
            TicketBuildReplySelectionDetail[] arr = value == null ? null : value.toArray(new TicketBuildReplySelectionDetail[0]);
            return this.setSelectionDetails(arr);
        }
    }
}

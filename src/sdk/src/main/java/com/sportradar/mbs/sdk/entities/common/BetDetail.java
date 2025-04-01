package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.suggestion.Suggestion;

import java.util.List;

public class BetDetail {

    @JsonProperty("code")
    private int code;
    @JsonProperty("suggestion")
    private Suggestion suggestion;
    @JsonProperty("betId")
    private String betId;
    @JsonProperty("selectionDetails")
    private SelectionDetail[] selectionDetails;
    @JsonProperty("message")
    private String message;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int value) {
        this.code = value;
    }

    public Suggestion getSuggestion() {
        return this.suggestion;
    }

    public void setSuggestion(Suggestion value) {
        this.suggestion = value;
    }

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String value) {
        this.betId = value;
    }

    public SelectionDetail[] getSelectionDetails() {
        return this.selectionDetails;
    }

    public void setSelectionDetails(SelectionDetail[] value) {
        this.selectionDetails = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public static class Builder {

        private final BetDetail instance = new BetDetail();

        private Builder() {
        }

        public BetDetail build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setSuggestion(Suggestion value) {
            this.instance.setSuggestion(value);
            return this;
        }

        public Builder setBetId(String value) {
            this.instance.setBetId(value);
            return this;
        }

        public Builder setSelectionDetails(SelectionDetail... value) {
            this.instance.setSelectionDetails(value);
            return this;
        }

        public Builder setSelectionDetails(List<? extends SelectionDetail> value) {
            SelectionDetail[] arr = value == null ? null : value.toArray(new SelectionDetail[0]);
            return this.setSelectionDetails(arr);
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }
    }
}

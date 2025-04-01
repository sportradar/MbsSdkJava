package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;
import com.sportradar.mbs.sdk.entities.selection.Selection;

public class SelectionDetail {

    @JsonProperty("code")
    private int code;
    @JsonProperty("selection")
    private Selection selection;
    @JsonProperty("message")
    private String message;
    @JsonProperty("autoAcceptedOdds")
    private Odds autoAcceptedOdds;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int value) {
        this.code = value;
    }

    public Selection getSelection() {
        return this.selection;
    }

    public void setSelection(Selection value) {
        this.selection = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public Odds getAutoAcceptedOdds() {
        return this.autoAcceptedOdds;
    }

    public void setAutoAcceptedOdds(Odds value) {
        this.autoAcceptedOdds = value;
    }

    public static class Builder {

        private final SelectionDetail instance = new SelectionDetail();

        private Builder() {
        }

        public SelectionDetail build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setSelection(Selection value) {
            this.instance.setSelection(value);
            return this;
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }

        public Builder setAutoAcceptedOdds(Odds value) {
            this.instance.setAutoAcceptedOdds(value);
            return this;
        }
    }
}

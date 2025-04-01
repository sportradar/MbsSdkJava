package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.selection.Selection;

public class TicketBuildReplySelectionDetail {

    @JsonProperty("selection")
    private Selection selection;
    @JsonProperty("appliedEventRating")
    private Integer appliedEventRating;
    @JsonProperty("suggestedEventRating")
    private Integer suggestedEventRating;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Selection getSelection() {
        return this.selection;
    }

    public void setSelection(Selection value) {
        this.selection = value;
    }

    public Integer getAppliedEventRating() {
        return this.appliedEventRating;
    }

    public void setAppliedEventRating(Integer value) {
        this.appliedEventRating = value;
    }

    public Integer getSuggestedEventRating() {
        return this.suggestedEventRating;
    }

    public void setSuggestedEventRating(Integer value) {
        this.suggestedEventRating = value;
    }

    public static class Builder {

        private final TicketBuildReplySelectionDetail instance = new TicketBuildReplySelectionDetail();

        private Builder() {
        }

        public TicketBuildReplySelectionDetail build() {
            return this.instance;
        }

        public Builder setSelection(Selection value) {
            this.instance.setSelection(value);
            return this;
        }

        public Builder setAppliedEventRating(Integer value) {
            this.instance.setAppliedEventRating(value);
            return this;
        }

        public Builder setSuggestedEventRating(Integer value) {
            this.instance.setSuggestedEventRating(value);
            return this;
        }
    }
}

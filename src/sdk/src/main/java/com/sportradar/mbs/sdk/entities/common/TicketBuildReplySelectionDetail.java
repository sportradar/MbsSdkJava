package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.probability.SelectionProbability;
import com.sportradar.mbs.sdk.entities.resulting.SelectionResult;
import com.sportradar.mbs.sdk.entities.selection.Selection;

import java.math.BigDecimal;

public class TicketBuildReplySelectionDetail {

    @JsonProperty("suggestedLtd")
    private Integer suggestedLtd;
    @JsonProperty("selection")
    private Selection selection;
    @JsonProperty("currentResult")
    private SelectionResult currentResult;
    @JsonProperty("configuredLtd")
    private Integer configuredLtd;
    @JsonProperty("appliedMarketFactor")
    private BigDecimal appliedMarketFactor;
    @JsonProperty("currentProbability")
    private SelectionProbability currentProbability;
    @JsonProperty("appliedEventRating")
    private Integer appliedEventRating;
    @JsonProperty("suggestedEventRating")
    private Integer suggestedEventRating;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getSuggestedLtd() {
        return this.suggestedLtd;
    }

    public void setSuggestedLtd(Integer value) {
        this.suggestedLtd = value;
    }

    public Selection getSelection() {
        return this.selection;
    }

    public void setSelection(Selection value) {
        this.selection = value;
    }

    public SelectionResult getCurrentResult() {
        return this.currentResult;
    }

    public void setCurrentResult(SelectionResult value) {
        this.currentResult = value;
    }

    public Integer getConfiguredLtd() {
        return this.configuredLtd;
    }

    public void setConfiguredLtd(Integer value) {
        this.configuredLtd = value;
    }

    public BigDecimal getAppliedMarketFactor() {
        return this.appliedMarketFactor;
    }

    public void setAppliedMarketFactor(BigDecimal value) {
        this.appliedMarketFactor = value;
    }

    public SelectionProbability getCurrentProbability() {
        return this.currentProbability;
    }

    public void setCurrentProbability(SelectionProbability value) {
        this.currentProbability = value;
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

        public Builder setSuggestedLtd(Integer value) {
            this.instance.setSuggestedLtd(value);
            return this;
        }

        public Builder setSelection(Selection value) {
            this.instance.setSelection(value);
            return this;
        }

        public Builder setCurrentResult(SelectionResult value) {
            this.instance.setCurrentResult(value);
            return this;
        }

        public Builder setConfiguredLtd(Integer value) {
            this.instance.setConfiguredLtd(value);
            return this;
        }

        public Builder setAppliedMarketFactor(BigDecimal value) {
            this.instance.setAppliedMarketFactor(value);
            return this;
        }

        public Builder setCurrentProbability(SelectionProbability value) {
            this.instance.setCurrentProbability(value);
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

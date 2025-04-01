package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class EndCustomerSuggestions {

    @JsonProperty("appliedConfidence")
    private BigDecimal appliedConfidence;
    @JsonProperty("suggestedConfidence")
    private BigDecimal suggestedConfidence;
    @JsonProperty("suggestedMarkerScore")
    private BigDecimal suggestedMarkerScore;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("suggestedBotScore")
    private BigDecimal suggestedBotScore;
    @JsonProperty("suggestedLateBetScore")
    private BigDecimal suggestedLateBetScore;

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getAppliedConfidence() {
        return this.appliedConfidence;
    }

    public void setAppliedConfidence(BigDecimal value) {
        this.appliedConfidence = value;
    }

    public BigDecimal getSuggestedConfidence() {
        return this.suggestedConfidence;
    }

    public void setSuggestedConfidence(BigDecimal value) {
        this.suggestedConfidence = value;
    }

    public BigDecimal getSuggestedMarkerScore() {
        return this.suggestedMarkerScore;
    }

    public void setSuggestedMarkerScore(BigDecimal value) {
        this.suggestedMarkerScore = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public BigDecimal getSuggestedBotScore() {
        return this.suggestedBotScore;
    }

    public void setSuggestedBotScore(BigDecimal value) {
        this.suggestedBotScore = value;
    }

    public BigDecimal getSuggestedLateBetScore() {
        return this.suggestedLateBetScore;
    }

    public void setSuggestedLateBetScore(BigDecimal value) {
        this.suggestedLateBetScore = value;
    }

    public static class Builder {

        private final EndCustomerSuggestions instance = new EndCustomerSuggestions();

        private Builder() {
        }

        public EndCustomerSuggestions build() {
            return this.instance;
        }

        public Builder setAppliedConfidence(BigDecimal value) {
            this.instance.setAppliedConfidence(value);
            return this;
        }

        public Builder setSuggestedConfidence(BigDecimal value) {
            this.instance.setSuggestedConfidence(value);
            return this;
        }

        public Builder setSuggestedMarkerScore(BigDecimal value) {
            this.instance.setSuggestedMarkerScore(value);
            return this;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }

        public Builder setSuggestedBotScore(BigDecimal value) {
            this.instance.setSuggestedBotScore(value);
            return this;
        }

        public Builder setSuggestedLateBetScore(BigDecimal value) {
            this.instance.setSuggestedLateBetScore(value);
            return this;
        }
    }
}

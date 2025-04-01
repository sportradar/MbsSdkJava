package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.channel.Channel;

import java.math.BigDecimal;

public class ChannelSuggestions {

    @JsonProperty("appliedConfidence")
    private BigDecimal appliedConfidence;
    @JsonProperty("suggestedConfidence")
    private BigDecimal suggestedConfidence;
    @JsonProperty("channel")
    private Channel channel;
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

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel value) {
        this.channel = value;
    }

    public BigDecimal getSuggestedLateBetScore() {
        return this.suggestedLateBetScore;
    }

    public void setSuggestedLateBetScore(BigDecimal value) {
        this.suggestedLateBetScore = value;
    }

    public static class Builder {

        private final ChannelSuggestions instance = new ChannelSuggestions();

        private Builder() {
        }

        public ChannelSuggestions build() {
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

        public Builder setChannel(Channel value) {
            this.instance.setChannel(value);
            return this;
        }

        public Builder setSuggestedLateBetScore(BigDecimal value) {
            this.instance.setSuggestedLateBetScore(value);
            return this;
        }
    }
}

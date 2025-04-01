package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LtdSuggestions {

    @JsonProperty("suggestedLtd")
    private Integer suggestedLtd;
    @JsonProperty("modelSuggestedLtd")
    private ModelSuggestedLtd modelSuggestedLtd;
    @JsonProperty("accountLbsLtdOffset")
    private Integer accountLbsLtdOffset;
    @JsonProperty("configuredLtd")
    private Integer configuredLtd;
    @JsonProperty("appliedLtd")
    private Integer appliedLtd;
    @JsonProperty("liveSelectionLtdOffset")
    private Integer liveSelectionLtdOffset;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getSuggestedLtd() {
        return this.suggestedLtd;
    }

    public void setSuggestedLtd(Integer value) {
        this.suggestedLtd = value;
    }

    public ModelSuggestedLtd getModelSuggestedLtd() {
        return this.modelSuggestedLtd;
    }

    public void setModelSuggestedLtd(ModelSuggestedLtd value) {
        this.modelSuggestedLtd = value;
    }

    public Integer getAccountLbsLtdOffset() {
        return this.accountLbsLtdOffset;
    }

    public void setAccountLbsLtdOffset(Integer value) {
        this.accountLbsLtdOffset = value;
    }

    public Integer getConfiguredLtd() {
        return this.configuredLtd;
    }

    public void setConfiguredLtd(Integer value) {
        this.configuredLtd = value;
    }

    public Integer getAppliedLtd() {
        return this.appliedLtd;
    }

    public void setAppliedLtd(Integer value) {
        this.appliedLtd = value;
    }

    public Integer getLiveSelectionLtdOffset() {
        return this.liveSelectionLtdOffset;
    }

    public void setLiveSelectionLtdOffset(Integer value) {
        this.liveSelectionLtdOffset = value;
    }

    public static class Builder {

        private final LtdSuggestions instance = new LtdSuggestions();

        private Builder() {
        }

        public LtdSuggestions build() {
            return this.instance;
        }

        public Builder setSuggestedLtd(Integer value) {
            this.instance.setSuggestedLtd(value);
            return this;
        }

        public Builder setModelSuggestedLtd(ModelSuggestedLtd value) {
            this.instance.setModelSuggestedLtd(value);
            return this;
        }

        public Builder setAccountLbsLtdOffset(Integer value) {
            this.instance.setAccountLbsLtdOffset(value);
            return this;
        }

        public Builder setConfiguredLtd(Integer value) {
            this.instance.setConfiguredLtd(value);
            return this;
        }

        public Builder setAppliedLtd(Integer value) {
            this.instance.setAppliedLtd(value);
            return this;
        }

        public Builder setLiveSelectionLtdOffset(Integer value) {
            this.instance.setLiveSelectionLtdOffset(value);
            return this;
        }
    }
}

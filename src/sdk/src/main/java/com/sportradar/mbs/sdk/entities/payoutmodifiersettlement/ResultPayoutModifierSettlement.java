package com.sportradar.mbs.sdk.entities.payoutmodifiersettlement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.resulting.SelectionResult;

public class ResultPayoutModifierSettlement extends PayoutModifierSettlement {

    @JsonProperty("result")
    private SelectionResult result;

    public SelectionResult getResult() {
        return this.result;
    }

    public void setResult(SelectionResult value) {
        this.result = value;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final ResultPayoutModifierSettlement instance = new ResultPayoutModifierSettlement();

        private Builder() {
        }

        public ResultPayoutModifierSettlement build() {
            return this.instance;
        }

        public Builder setResult(SelectionResult value) {
            this.instance.setResult(value);
            return this;
        }
    }
}

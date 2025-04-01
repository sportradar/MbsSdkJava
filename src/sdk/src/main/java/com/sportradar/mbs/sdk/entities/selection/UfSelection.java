package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class UfSelection extends Selection {

    @JsonProperty("eventId")
    private String eventId;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("odds")
    private Odds odds;
    @JsonProperty("outcomeId")
    private String outcomeId;
    @JsonProperty("specifiers")
    private String specifiers;
    @JsonProperty("marketId")
    private String marketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String value) {
        this.eventId = value;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String value) {
        this.productId = value;
    }

    public Odds getOdds() {
        return this.odds;
    }

    public void setOdds(Odds value) {
        this.odds = value;
    }

    public String getOutcomeId() {
        return this.outcomeId;
    }

    public void setOutcomeId(String value) {
        this.outcomeId = value;
    }

    public String getSpecifiers() {
        return this.specifiers;
    }

    public void setSpecifiers(String value) {
        this.specifiers = value;
    }

    public String getMarketId() {
        return this.marketId;
    }

    public void setMarketId(String value) {
        this.marketId = value;
    }

    public static class Builder {

        private final UfSelection instance = new UfSelection();

        private Builder() {
        }

        public UfSelection build() {
            return this.instance;
        }

        public Builder setEventId(String value) {
            this.instance.setEventId(value);
            return this;
        }

        public Builder setProductId(String value) {
            this.instance.setProductId(value);
            return this;
        }

        public Builder setOdds(Odds value) {
            this.instance.setOdds(value);
            return this;
        }

        public Builder setOutcomeId(String value) {
            this.instance.setOutcomeId(value);
            return this;
        }

        public Builder setSpecifiers(String value) {
            this.instance.setSpecifiers(value);
            return this;
        }

        public Builder setMarketId(String value) {
            this.instance.setMarketId(value);
            return this;
        }
    }
}

package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CasinoGame {

    @JsonProperty("provider")
    private String provider;
    @JsonProperty("id")
    private String id;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String value) {
        this.provider = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public static class Builder {

        private final CasinoGame instance = new CasinoGame();

        private Builder() {
        }

        public CasinoGame build() {
            return this.instance;
        }

        public Builder setProvider(String value) {
            this.instance.setProvider(value);
            return this;
        }

        public Builder setId(String value) {
            this.instance.setId(value);
            return this;
        }
    }
}

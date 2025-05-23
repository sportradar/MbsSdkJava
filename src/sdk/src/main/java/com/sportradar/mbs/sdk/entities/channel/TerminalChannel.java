package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TerminalChannel extends Channel {

    @JsonProperty("terminalId")
    private String terminalId;
    @JsonProperty("shopId")
    private String shopId;
    @JsonProperty("lang")
    private String lang;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopId(String value) {
        this.shopId = value;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

    public static class Builder {

        private final TerminalChannel instance = new TerminalChannel();

        private Builder() {
        }

        public TerminalChannel build() {
            return this.instance;
        }

        public Builder setTerminalId(String value) {
            this.instance.setTerminalId(value);
            return this;
        }

        public Builder setShopId(String value) {
            this.instance.setShopId(value);
            return this;
        }

        public Builder setLang(String value) {
            this.instance.setLang(value);
            return this;
        }
    }
}

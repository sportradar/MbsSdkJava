package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.channel.Channel;

public class CasinoContext {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWalletId() {
        return this.walletId;
    }

    public void setWalletId(String value) {
        this.walletId = value;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel value) {
        this.channel = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public static class Builder {

        private final CasinoContext instance = new CasinoContext();

        private Builder() {
        }

        public CasinoContext build() {
            return this.instance;
        }

        public Builder setWalletId(String value) {
            this.instance.setWalletId(value);
            return this;
        }

        public Builder setChannel(Channel value) {
            this.instance.setChannel(value);
            return this;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }
    }
}

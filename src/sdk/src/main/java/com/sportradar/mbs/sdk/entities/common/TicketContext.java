package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.channel.Channel;
import com.sportradar.mbs.sdk.entities.payout.Payout;
import com.sportradar.mbs.sdk.entities.ref.TicketRef;

import java.util.List;

public class TicketContext {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("ref")
    private TicketRef ref;
    @JsonProperty("rates")
    private ExchangeRate[] rates;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("limitId")
    private long limitId;
    @JsonProperty("payoutCap")
    private Payout[] payoutCap;
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

    public TicketRef getRef() {
        return this.ref;
    }

    public void setRef(TicketRef value) {
        this.ref = value;
    }

    public ExchangeRate[] getRates() {
        return this.rates;
    }

    public void setRates(ExchangeRate[] value) {
        this.rates = value;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel value) {
        this.channel = value;
    }

    public long getLimitId() {
        return this.limitId;
    }

    public void setLimitId(long value) {
        this.limitId = value;
    }

    public Payout[] getPayoutCap() {
        return this.payoutCap;
    }

    public void setPayoutCap(Payout[] value) {
        this.payoutCap = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public static class Builder {

        private final TicketContext instance = new TicketContext();

        private Builder() {
        }

        public TicketContext build() {
            return this.instance;
        }

        public Builder setWalletId(String value) {
            this.instance.setWalletId(value);
            return this;
        }

        public Builder setRef(TicketRef value) {
            this.instance.setRef(value);
            return this;
        }

        public Builder setRates(ExchangeRate... value) {
            this.instance.setRates(value);
            return this;
        }

        public Builder setRates(List<? extends ExchangeRate> value) {
            ExchangeRate[] arr = value == null ? null : value.toArray(new ExchangeRate[0]);
            return this.setRates(arr);
        }

        public Builder setChannel(Channel value) {
            this.instance.setChannel(value);
            return this;
        }

        public Builder setLimitId(long value) {
            this.instance.setLimitId(value);
            return this;
        }

        public Builder setPayoutCap(Payout... value) {
            this.instance.setPayoutCap(value);
            return this;
        }

        public Builder setPayoutCap(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setPayoutCap(arr);
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }
    }
}

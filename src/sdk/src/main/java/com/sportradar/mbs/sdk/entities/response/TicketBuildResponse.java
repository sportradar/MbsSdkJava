package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.*;

import java.util.List;

public class TicketBuildResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("channelSuggestions")
    private ChannelSuggestions channelSuggestions;
    @JsonProperty("exchangeRate")
    private ExchangeRate[] exchangeRate;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("betDetails")
    private TicketBuildReplyBetDetail[] betDetails;
    @JsonProperty("endCustomerSuggestions")
    private EndCustomerSuggestions endCustomerSuggestions;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ltd")
    private LtdSuggestions ltd;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int value) {
        this.code = value;
    }

    public ChannelSuggestions getChannelSuggestions() {
        return this.channelSuggestions;
    }

    public void setChannelSuggestions(ChannelSuggestions value) {
        this.channelSuggestions = value;
    }

    public ExchangeRate[] getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(ExchangeRate[] value) {
        this.exchangeRate = value;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String value) {
        this.signature = value;
    }

    public TicketBuildReplyBetDetail[] getBetDetails() {
        return this.betDetails;
    }

    public void setBetDetails(TicketBuildReplyBetDetail[] value) {
        this.betDetails = value;
    }

    public EndCustomerSuggestions getEndCustomerSuggestions() {
        return this.endCustomerSuggestions;
    }

    public void setEndCustomerSuggestions(EndCustomerSuggestions value) {
        this.endCustomerSuggestions = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public LtdSuggestions getLtd() {
        return this.ltd;
    }

    public void setLtd(LtdSuggestions value) {
        this.ltd = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final TicketBuildResponse instance = new TicketBuildResponse();

        private Builder() {
        }

        public TicketBuildResponse build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setChannelSuggestions(ChannelSuggestions value) {
            this.instance.setChannelSuggestions(value);
            return this;
        }

        public Builder setExchangeRate(ExchangeRate... value) {
            this.instance.setExchangeRate(value);
            return this;
        }

        public Builder setExchangeRate(List<? extends ExchangeRate> value) {
            ExchangeRate[] arr = value == null ? null : value.toArray(new ExchangeRate[0]);
            return this.setExchangeRate(arr);
        }

        public Builder setSignature(String value) {
            this.instance.setSignature(value);
            return this;
        }

        public Builder setBetDetails(TicketBuildReplyBetDetail... value) {
            this.instance.setBetDetails(value);
            return this;
        }

        public Builder setBetDetails(List<? extends TicketBuildReplyBetDetail> value) {
            TicketBuildReplyBetDetail[] arr = value == null ? null : value.toArray(new TicketBuildReplyBetDetail[0]);
            return this.setBetDetails(arr);
        }

        public Builder setEndCustomerSuggestions(EndCustomerSuggestions value) {
            this.instance.setEndCustomerSuggestions(value);
            return this;
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }

        public Builder setLtd(LtdSuggestions value) {
            this.instance.setLtd(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}

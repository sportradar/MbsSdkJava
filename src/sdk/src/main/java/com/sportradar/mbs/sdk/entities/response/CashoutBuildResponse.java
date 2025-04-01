package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.*;

import java.util.List;

public class CashoutBuildResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("channelSuggestions")
    private ChannelSuggestions channelSuggestions;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("exchangeRate")
    private ExchangeRate[] exchangeRate;
    @JsonProperty("cashoutId")
    private String cashoutId;
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
    @JsonProperty("cashout")
    private CashoutSuggestions cashout;
    @JsonProperty("status")
    private AcceptanceStatus status;

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

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String value) {
        this.signature = value;
    }

    public ExchangeRate[] getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(ExchangeRate[] value) {
        this.exchangeRate = value;
    }

    public String getCashoutId() {
        return this.cashoutId;
    }

    public void setCashoutId(String value) {
        this.cashoutId = value;
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

    public CashoutSuggestions getCashout() {
        return this.cashout;
    }

    public void setCashout(CashoutSuggestions value) {
        this.cashout = value;
    }

    public AcceptanceStatus getStatus() {
        return this.status;
    }

    public void setStatus(AcceptanceStatus value) {
        this.status = value;
    }

    public static class Builder {

        private final CashoutBuildResponse instance = new CashoutBuildResponse();

        private Builder() {
        }

        public CashoutBuildResponse build() {
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

        public Builder setSignature(String value) {
            this.instance.setSignature(value);
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

        public Builder setCashoutId(String value) {
            this.instance.setCashoutId(value);
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

        public Builder setCashout(CashoutSuggestions value) {
            this.instance.setCashout(value);
            return this;
        }

        public Builder setStatus(AcceptanceStatus value) {
            this.instance.setStatus(value);
            return this;
        }
    }
}

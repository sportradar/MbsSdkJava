package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.AcceptanceStatus;
import com.sportradar.mbs.sdk.entities.common.BetDetail;
import com.sportradar.mbs.sdk.entities.common.ExchangeRate;

import java.util.List;

public class TicketInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("exchangeRate")
    private ExchangeRate[] exchangeRate;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("betDetails")
    private BetDetail[] betDetails;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ticketId")
    private String ticketId;
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

    public BetDetail[] getBetDetails() {
        return this.betDetails;
    }

    public void setBetDetails(BetDetail[] value) {
        this.betDetails = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public AcceptanceStatus getStatus() {
        return this.status;
    }

    public void setStatus(AcceptanceStatus value) {
        this.status = value;
    }

    public static class Builder {

        private final TicketInformResponse instance = new TicketInformResponse();

        private Builder() {
        }

        public TicketInformResponse build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
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

        public Builder setBetDetails(BetDetail... value) {
            this.instance.setBetDetails(value);
            return this;
        }

        public Builder setBetDetails(List<? extends BetDetail> value) {
            BetDetail[] arr = value == null ? null : value.toArray(new BetDetail[0]);
            return this.setBetDetails(arr);
        }

        public Builder setMessage(String value) {
            this.instance.setMessage(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }

        public Builder setStatus(AcceptanceStatus value) {
            this.instance.setStatus(value);
            return this;
        }
    }
}

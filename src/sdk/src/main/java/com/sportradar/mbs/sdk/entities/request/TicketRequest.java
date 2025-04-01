package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.Bet;
import com.sportradar.mbs.sdk.entities.common.TicketContext;

import java.util.List;

public class TicketRequest extends ContentRequest {

    @JsonProperty("context")
    private TicketContext context;
    @JsonProperty("bets")
    private Bet[] bets;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public TicketContext getContext() {
        return this.context;
    }

    public void setContext(TicketContext value) {
        this.context = value;
    }

    public Bet[] getBets() {
        return this.bets;
    }

    public void setBets(Bet[] value) {
        this.bets = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final TicketRequest instance = new TicketRequest();

        private Builder() {
        }

        public TicketRequest build() {
            return this.instance;
        }

        public Builder setContext(TicketContext value) {
            this.instance.setContext(value);
            return this;
        }

        public Builder setBets(Bet... value) {
            this.instance.setBets(value);
            return this;
        }

        public Builder setBets(List<? extends Bet> value) {
            Bet[] arr = value == null ? null : value.toArray(new Bet[0]);
            return this.setBets(arr);
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}

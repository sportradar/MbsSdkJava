package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.BetValidation;

import java.util.List;

public class TicketInformRequest extends ContentRequest {

    @JsonProperty("ticket")
    private TicketRequest ticket;
    @JsonProperty("betValidations")
    private BetValidation[] betValidations;

    public static Builder newBuilder() {
        return new Builder();
    }

    public TicketRequest getTicket() {
        return this.ticket;
    }

    public void setTicket(TicketRequest value) {
        this.ticket = value;
    }

    public BetValidation[] getBetValidations() {
        return this.betValidations;
    }

    public void setBetValidations(BetValidation[] value) {
        this.betValidations = value;
    }

    public static class Builder {

        private final TicketInformRequest instance = new TicketInformRequest();

        private Builder() {
        }

        public TicketInformRequest build() {
            return this.instance;
        }

        public Builder setTicket(TicketRequest value) {
            this.instance.setTicket(value);
            return this;
        }

        public Builder setBetValidations(BetValidation... value) {
            this.instance.setBetValidations(value);
            return this;
        }

        public Builder setBetValidations(List<? extends BetValidation> value) {
            BetValidation[] arr = value == null ? null : value.toArray(new BetValidation[0]);
            return this.setBetValidations(arr);
        }
    }
}

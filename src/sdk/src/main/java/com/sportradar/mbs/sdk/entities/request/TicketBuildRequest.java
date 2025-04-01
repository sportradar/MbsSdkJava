package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketBuildRequest extends ContentRequest {

    @JsonProperty("ticket")
    private TicketRequest ticket;

    public static Builder newBuilder() {
        return new Builder();
    }

    public TicketRequest getTicket() {
        return this.ticket;
    }

    public void setTicket(TicketRequest value) {
        this.ticket = value;
    }

    public static class Builder {

        private final TicketBuildRequest instance = new TicketBuildRequest();

        private Builder() {
        }

        public TicketBuildRequest build() {
            return this.instance;
        }

        public Builder setTicket(TicketRequest value) {
            this.instance.setTicket(value);
            return this;
        }
    }
}

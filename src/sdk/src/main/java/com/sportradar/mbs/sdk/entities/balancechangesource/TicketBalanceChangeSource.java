package com.sportradar.mbs.sdk.entities.balancechangesource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketBalanceChangeSource extends BalanceChangeSource {

    @JsonProperty("action")
    private TicketBalanceChangeAction action;
    @JsonProperty("id")
    private String id;

    public static Builder newBuilder() {
        return new Builder();
    }

    public TicketBalanceChangeAction getAction() {
        return this.action;
    }

    public void setAction(TicketBalanceChangeAction value) {
        this.action = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public static class Builder {

        private final TicketBalanceChangeSource instance = new TicketBalanceChangeSource();

        private Builder() {
        }

        public TicketBalanceChangeSource build() {
            return this.instance;
        }

        public Builder setAction(TicketBalanceChangeAction value) {
            this.instance.setAction(value);
            return this;
        }

        public Builder setId(String value) {
            this.instance.setId(value);
            return this;
        }
    }
}

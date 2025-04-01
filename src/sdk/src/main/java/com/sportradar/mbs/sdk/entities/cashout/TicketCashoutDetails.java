package com.sportradar.mbs.sdk.entities.cashout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

import java.util.List;

public class TicketCashoutDetails extends CashoutDetails {

    @JsonProperty("code")
    private int code;
    @JsonProperty("payout")
    private Payout[] payout;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
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

    public Payout[] getPayout() {
        return this.payout;
    }

    public void setPayout(Payout[] value) {
        this.payout = value;
    }

    public String getTicketSignature() {
        return this.ticketSignature;
    }

    public void setTicketSignature(String value) {
        this.ticketSignature = value;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final TicketCashoutDetails instance = new TicketCashoutDetails();

        private Builder() {
        }

        public TicketCashoutDetails build() {
            return this.instance;
        }

        public Builder setCode(int value) {
            this.instance.setCode(value);
            return this;
        }

        public Builder setPayout(Payout... value) {
            this.instance.setPayout(value);
            return this;
        }

        public Builder setPayout(List<? extends Payout> value) {
            Payout[] arr = value == null ? null : value.toArray(new Payout[0]);
            return this.setPayout(arr);
        }

        public Builder setTicketSignature(String value) {
            this.instance.setTicketSignature(value);
            return this;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}

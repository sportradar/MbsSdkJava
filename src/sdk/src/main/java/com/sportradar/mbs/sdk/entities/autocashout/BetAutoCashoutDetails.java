package com.sportradar.mbs.sdk.entities.autocashout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.autocashoutthreshold.AutoCashoutThreshold;

import java.util.List;

public class BetAutoCashoutDetails extends AutoCashoutDetails {

    @JsonProperty("betId")
    private String betId;
    @JsonProperty("threshold")
    private AutoCashoutThreshold[] threshold;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBetId() {
        return this.betId;
    }

    public void setBetId(String value) {
        this.betId = value;
    }

    public AutoCashoutThreshold[] getThreshold() {
        return this.threshold;
    }

    public void setThreshold(AutoCashoutThreshold[] value) {
        this.threshold = value;
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

        private final BetAutoCashoutDetails instance = new BetAutoCashoutDetails();

        private Builder() {
        }

        public BetAutoCashoutDetails build() {
            return this.instance;
        }

        public Builder setBetId(String value) {
            this.instance.setBetId(value);
            return this;
        }

        public Builder setThreshold(AutoCashoutThreshold... value) {
            this.instance.setThreshold(value);
            return this;
        }

        public Builder setThreshold(List<? extends AutoCashoutThreshold> value) {
            AutoCashoutThreshold[] arr = value == null ? null : value.toArray(new AutoCashoutThreshold[0]);
            return this.setThreshold(arr);
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

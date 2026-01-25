package com.sportradar.mbs.sdk.entities.autocashout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.autocashoutthreshold.AutoCashoutThreshold;

import java.util.List;

public class TicketAutoCashoutDetails extends AutoCashoutDetails {

    @JsonProperty("threshold")
    private AutoCashoutThreshold[] threshold;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
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

        private final TicketAutoCashoutDetails instance = new TicketAutoCashoutDetails();

        private Builder() {
        }

        public TicketAutoCashoutDetails build() {
            return this.instance;
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

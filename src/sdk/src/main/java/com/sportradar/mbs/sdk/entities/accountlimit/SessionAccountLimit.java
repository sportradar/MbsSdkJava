package com.sportradar.mbs.sdk.entities.accountlimit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionAccountLimit extends AccountLimit {

    @JsonProperty("duration")
    private int duration;

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int value) {
        this.duration = value;
    }

    public static class Builder {

        private final SessionAccountLimit instance = new SessionAccountLimit();

        private Builder() {
        }

        public SessionAccountLimit build() {
            return this.instance;
        }

        public Builder setDuration(int value) {
            this.instance.setDuration(value);
            return this;
        }
    }
}

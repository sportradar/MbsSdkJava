package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallCentreChannel extends Channel {

    @JsonProperty("lang")
    private String lang;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

    public static class Builder {

        private final CallCentreChannel instance = new CallCentreChannel();

        private Builder() {
        }

        public CallCentreChannel build() {
            return this.instance;
        }

        public Builder setLang(String value) {
            this.instance.setLang(value);
            return this;
        }
    }
}

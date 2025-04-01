package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsChannel extends Channel {

    @JsonProperty("lang")
    private String lang;
    @JsonProperty("deviceId")
    private String deviceId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    public static class Builder {

        private final SmsChannel instance = new SmsChannel();

        private Builder() {
        }

        public SmsChannel build() {
            return this.instance;
        }

        public Builder setLang(String value) {
            this.instance.setLang(value);
            return this;
        }

        public Builder setDeviceId(String value) {
            this.instance.setDeviceId(value);
            return this;
        }
    }
}

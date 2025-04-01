package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MobileAppChannel extends Channel {

    @JsonProperty("ip")
    private String ip;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("deviceId")
    private String deviceId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String value) {
        this.ip = value;
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

        private final MobileAppChannel instance = new MobileAppChannel();

        private Builder() {
        }

        public MobileAppChannel build() {
            return this.instance;
        }

        public Builder setIp(String value) {
            this.instance.setIp(value);
            return this;
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

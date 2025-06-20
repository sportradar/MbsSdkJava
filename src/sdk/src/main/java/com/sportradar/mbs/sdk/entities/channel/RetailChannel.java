package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.location.Location;

public class RetailChannel extends Channel {

    @JsonProperty("location")
    private Location location;
    @JsonProperty("shopId")
    private String shopId;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("deviceId")
    private String deviceId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location value) {
        this.location = value;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopId(String value) {
        this.shopId = value;
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

        private final RetailChannel instance = new RetailChannel();

        private Builder() {
        }

        public RetailChannel build() {
            return this.instance;
        }

        public Builder setLocation(Location value) {
            this.instance.setLocation(value);
            return this;
        }

        public Builder setShopId(String value) {
            this.instance.setShopId(value);
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

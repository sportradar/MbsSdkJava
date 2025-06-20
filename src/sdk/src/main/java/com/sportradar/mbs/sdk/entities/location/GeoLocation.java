package com.sportradar.mbs.sdk.entities.location;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoLocation extends Location {

    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;

    public static Builder newBuilder() {
        return new Builder();
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double value) {
        this.latitude = value;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double value) {
        this.longitude = value;
    }

    public static class Builder {

        private final GeoLocation instance = new GeoLocation();

        private Builder() {
        }

        public GeoLocation build() {
            return this.instance;
        }

        public Builder setLatitude(double value) {
            this.instance.setLatitude(value);
            return this;
        }

        public Builder setLongitude(double value) {
            this.instance.setLongitude(value);
            return this;
        }
    }
}

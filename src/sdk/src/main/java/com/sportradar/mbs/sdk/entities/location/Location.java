package com.sportradar.mbs.sdk.entities.location;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GeoLocation.class, name = "geo")
})
public abstract class Location {

    public static GeoLocation.Builder newGeoLocationBuilder() {
        return GeoLocation.newBuilder();
    }

}

package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum StatusDuration {
    TEMPORARY("temporary"),
    PERMANENT("permanent");

    private static final Map<String, StatusDuration> VALUES = new HashMap<>();

    static {
        for (final StatusDuration val : EnumSet.allOf(StatusDuration.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    StatusDuration(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static StatusDuration fromValue(final String value) {
        return value == null ? null : VALUES.get(value);
    }

    @JsonValue
    public String getJsonValue() {
        return this.jsonVal;
    }

    public String toString() {
        return this.jsonVal;
    }

}

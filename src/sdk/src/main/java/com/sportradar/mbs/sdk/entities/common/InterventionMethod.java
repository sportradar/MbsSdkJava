package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum InterventionMethod {
    OTHER("other"),
    LIMIT_UPDATE("limits-update"),
    EMAIL("email"),
    CARE_CALL("care-call"),
    RG_MESSAGING("rg-messaging"),
    POPUP("pop-up");

    private static final Map<String, InterventionMethod> VALUES = new HashMap();

    static {
        for (final InterventionMethod val : EnumSet.allOf(InterventionMethod.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    InterventionMethod(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static InterventionMethod fromValue(final String value) {
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

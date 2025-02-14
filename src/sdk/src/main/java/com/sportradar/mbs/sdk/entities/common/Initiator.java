package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Initiator {
    REGULATOR("regulator"),
    OTHER("other"),
    OPERATOR("operator"),
    PLAYER("player");

    private static final Map<String, Initiator> VALUES = new HashMap<>();

    static {
        for (final Initiator val : EnumSet.allOf(Initiator.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    Initiator(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static Initiator fromValue(final String value) {
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

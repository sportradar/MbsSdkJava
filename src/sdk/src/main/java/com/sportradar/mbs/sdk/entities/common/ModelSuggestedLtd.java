package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum ModelSuggestedLtd {
    NONE("None"),
    SKIP("Skip"),
    DELAY("Delay");

    private static final Map<String, ModelSuggestedLtd> VALUES = new HashMap();

    static {
        for (final ModelSuggestedLtd val : EnumSet.allOf(ModelSuggestedLtd.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    ModelSuggestedLtd(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static ModelSuggestedLtd fromValue(final String value) {
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

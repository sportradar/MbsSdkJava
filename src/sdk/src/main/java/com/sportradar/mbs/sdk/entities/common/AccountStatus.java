package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum AccountStatus {
    EXCLUDED("excluded"),
    DISABLED("disabled"),
    ACTIVE("active");

    private static final Map<String, AccountStatus> VALUES = new HashMap();

    static {
        for (final AccountStatus val : EnumSet.allOf(AccountStatus.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    AccountStatus(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static AccountStatus fromValue(final String value) {
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

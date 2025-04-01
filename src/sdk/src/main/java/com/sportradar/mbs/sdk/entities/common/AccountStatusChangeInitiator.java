package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum AccountStatusChangeInitiator {
    OPERATOR("operator"),
    OTHER("other"),
    PLAYER("player"),
    REGULATOR("regulator");

    private static final Map<String, AccountStatusChangeInitiator> VALUES = new HashMap();

    static {
        for (final AccountStatusChangeInitiator val : EnumSet.allOf(AccountStatusChangeInitiator.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    AccountStatusChangeInitiator(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static AccountStatusChangeInitiator fromValue(final String value) {
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

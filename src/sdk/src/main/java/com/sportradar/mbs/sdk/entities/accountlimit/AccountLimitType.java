package com.sportradar.mbs.sdk.entities.accountlimit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum AccountLimitType {
    LOSS("loss"),
    DEPOSIT("deposit"),
    SESSION("session"),
    STAKE("stake");

    private static final Map<String, AccountLimitType> VALUES = new HashMap();

    static {
        for (final AccountLimitType val : EnumSet.allOf(AccountLimitType.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    AccountLimitType(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static AccountLimitType fromValue(final String value) {
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

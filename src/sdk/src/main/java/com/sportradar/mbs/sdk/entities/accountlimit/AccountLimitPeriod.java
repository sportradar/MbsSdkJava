package com.sportradar.mbs.sdk.entities.accountlimit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum AccountLimitPeriod {
    DAILY("daily"),
    MONTHLY("monthly"),
    WEEKLY("weekly");

    private static final Map<String, AccountLimitPeriod> VALUES = new HashMap();

    static {
        for (final AccountLimitPeriod val : EnumSet.allOf(AccountLimitPeriod.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    AccountLimitPeriod(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static AccountLimitPeriod fromValue(final String value) {
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

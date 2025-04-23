package com.sportradar.mbs.sdk.entities.payout;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum PayoutSourceType {
    ODDS_BOOST("odds-boost"),
    FREE_ROLLOVER("free-rollover"),
    FREE("free"),
    EXT_SETTLEMENT("ext-settlement"),
    CANCEL("cancel"),
    CASH("cash"),
    CASHOUT("cashout"),
    FREE_CASH("free-cash"),
    MANUAL_CASHOUT("manual-cancel"),
    MANUAL_CANCEL("manual-cashout"),
    BONUS("bonus");

    private static final Map<String, PayoutSourceType> VALUES = new HashMap();

    static {
        for (final PayoutSourceType val : EnumSet.allOf(PayoutSourceType.class)) {
            VALUES.put(val.jsonVal, val);
        }
    }

    private final String jsonVal;

    PayoutSourceType(final String jsonVal) {
        this.jsonVal = jsonVal;
    }

    @JsonCreator
    public static PayoutSourceType fromValue(final String value) {
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

package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum LimitFrequency {
  MONTHLY("monthly"),
  DAILY("daily"),
  WEEKLY("weekly");

  private static final Map<String, LimitFrequency> VALUES = new HashMap<>();

  static {
    for (final LimitFrequency val : EnumSet.allOf(LimitFrequency.class)) {
      VALUES.put(val.jsonVal, val);
    }
  }

  private final String jsonVal;

  LimitFrequency(final String jsonVal) { this.jsonVal = jsonVal; }

  @JsonCreator
  public static LimitFrequency fromValue(final String value) {
    return value == null ? null : VALUES.get(value);
  }

  @JsonValue
  public String getJsonValue() { return this.jsonVal; }

  public String toString() { return this.jsonVal; }

}

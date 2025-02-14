package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FinancialLimitType {
  DEPOSIT("deposit"),
  STAKE("stake"),
  LOSS("loss");

  private static final Map<String, FinancialLimitType> VALUES = new HashMap<>();

  static {
    for (final FinancialLimitType val : EnumSet.allOf(FinancialLimitType.class)) {
      VALUES.put(val.jsonVal, val);
    }
  }

  private final String jsonVal;

  FinancialLimitType(final String jsonVal) { this.jsonVal = jsonVal; }

  @JsonCreator
  public static FinancialLimitType fromValue(final String value) {
    return value == null ? null : VALUES.get(value);
  }

  @JsonValue
  public String getJsonValue() { return this.jsonVal; }

  public String toString() { return this.jsonVal; }

}

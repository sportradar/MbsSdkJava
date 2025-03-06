package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum representing different intervention methods.
 */
public enum Method {
    POPUP("pop-up"), // Pop-up notification method
    RG_MESSAGING("rg-messaging"), // Responsible gaming messaging method
    EMAIL("email"), // Email notification method
    LIMIT_UPDATE("limits-update"), // Limit update method
    CARE_CALL("care-call"), // Care call method
    OTHER("other"); // Other unspecified method

    private static final Map<String, Method> VALUES = new HashMap<>();

    static {
        // Populating the mapping of string values to enum constants
        for (final Method lt : values()) {
            VALUES.put(lt.value, lt);
        }
    }

    private final String value;

    /**
     * Constructor for Method enum.
     *
     * @param value The string representation of the method.
     */
    Method(final String value) {
        this.value = value;
    }

    /**
     * Converts a string value to its corresponding Method enum.
     *
     * @param value The string representation of the method.
     * @return The corresponding Method enum or null if not found.
     */
    @JsonCreator
    public static Method fromValue(final String value) {
        return value == null ? null : VALUES.get(value);
    }

    /**
     * Returns the string representation of the Method enum.
     *
     * @return The string value of the method.
     */
    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Gets the string value associated with the enum.
     *
     * @return The string representation of the method.
     */
    @JsonValue
    public String value() {
        return this.value;
    }
}
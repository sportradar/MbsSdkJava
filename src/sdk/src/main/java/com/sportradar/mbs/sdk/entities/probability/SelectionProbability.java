package com.sportradar.mbs.sdk.entities.probability;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PushSelectionProbability.class, name = "push"),
        @JsonSubTypes.Type(value = WinSelectionProbability.class, name = "win")
})
public abstract class SelectionProbability {

    public static PushSelectionProbability.Builder newPushSelectionProbabilityBuilder() {
        return PushSelectionProbability.newBuilder();
    }

    public static WinSelectionProbability.Builder newWinSelectionProbabilityBuilder() {
        return WinSelectionProbability.newBuilder();
    }

}

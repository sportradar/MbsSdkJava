package com.sportradar.mbs.sdk.entities.suggestion;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AltStakeSuggestion.class, name = "alt-stake"),
        @JsonSubTypes.Type(value = ReofferSuggestion.class, name = "reoffer")
})
public abstract class Suggestion {

    public static AltStakeSuggestion.Builder newAltStakeSuggestionBuilder() {
        return AltStakeSuggestion.newBuilder();
    }

    public static ReofferSuggestion.Builder newReofferSuggestionBuilder() {
        return ReofferSuggestion.newBuilder();
    }

}

package com.sportradar.mbs.sdk.entities.ref;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AltStakeTicketRef.class, name = "alt-stake"),
        @JsonSubTypes.Type(value = ReofferTicketRef.class, name = "reoffer")
})
public abstract class TicketRef {

    public static AltStakeTicketRef.Builder newAltStakeTicketRefBuilder() {
        return AltStakeTicketRef.newBuilder();
    }

    public static ReofferTicketRef.Builder newReofferTicketRefBuilder() {
        return ReofferTicketRef.newBuilder();
    }

}

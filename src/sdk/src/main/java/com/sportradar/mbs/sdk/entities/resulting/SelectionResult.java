package com.sportradar.mbs.sdk.entities.resulting;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CancelSelectionResult.class, name = "cancel"),
        @JsonSubTypes.Type(value = CashoutSelectionResult.class, name = "cashout"),
        @JsonSubTypes.Type(value = LostSelectionResult.class, name = "lost"),
        @JsonSubTypes.Type(value = UnsettledSelectionResult.class, name = "unsettled"),
        @JsonSubTypes.Type(value = VoidSelectionResult.class, name = "void"),
        @JsonSubTypes.Type(value = WinSelectionResult.class, name = "win")
})
public abstract class SelectionResult {

    public static CancelSelectionResult.Builder newCancelSelectionResultBuilder() {
        return CancelSelectionResult.newBuilder();
    }

    public static CashoutSelectionResult.Builder newCashoutSelectionResultBuilder() {
        return CashoutSelectionResult.newBuilder();
    }

    public static LostSelectionResult.Builder newLostSelectionResultBuilder() {
        return LostSelectionResult.newBuilder();
    }

    public static UnsettledSelectionResult.Builder newUnsettledSelectionResultBuilder() {
        return UnsettledSelectionResult.newBuilder();
    }

    public static VoidSelectionResult.Builder newVoidSelectionResultBuilder() {
        return VoidSelectionResult.newBuilder();
    }

    public static WinSelectionResult.Builder newWinSelectionResultBuilder() {
        return WinSelectionResult.newBuilder();
    }

}

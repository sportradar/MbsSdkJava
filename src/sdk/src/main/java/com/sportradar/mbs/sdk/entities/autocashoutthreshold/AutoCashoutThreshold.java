package com.sportradar.mbs.sdk.entities.autocashoutthreshold;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = StopLossAutoCashoutThreshold.class, name = "stop-loss"),
        @JsonSubTypes.Type(value = TakeWinAutoCashoutThreshold.class, name = "take-win")
})
public abstract class AutoCashoutThreshold {

    public static StopLossAutoCashoutThreshold.Builder newStopLossAutoCashoutThresholdBuilder() {
        return StopLossAutoCashoutThreshold.newBuilder();
    }

    public static TakeWinAutoCashoutThreshold.Builder newTakeWinAutoCashoutThresholdBuilder() {
        return TakeWinAutoCashoutThreshold.newBuilder();
    }
}

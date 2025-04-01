package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AgentChannel.class, name = "agent"),
        @JsonSubTypes.Type(value = CallCentreChannel.class, name = "call-centre"),
        @JsonSubTypes.Type(value = InternetChannel.class, name = "internet"),
        @JsonSubTypes.Type(value = MobileChannel.class, name = "mobile"),
        @JsonSubTypes.Type(value = MobileAppChannel.class, name = "mobile-app"),
        @JsonSubTypes.Type(value = PhoneChannel.class, name = "phone"),
        @JsonSubTypes.Type(value = RetailChannel.class, name = "retail"),
        @JsonSubTypes.Type(value = SmsChannel.class, name = "sms"),
        @JsonSubTypes.Type(value = TerminalChannel.class, name = "terminal"),
        @JsonSubTypes.Type(value = TvAppChannel.class, name = "tv-app")
})
public abstract class Channel {

    public static AgentChannel.Builder newAgentChannelBuilder() {
        return AgentChannel.newBuilder();
    }

    public static CallCentreChannel.Builder newCallCentreChannelBuilder() {
        return CallCentreChannel.newBuilder();
    }

    public static InternetChannel.Builder newInternetChannelBuilder() {
        return InternetChannel.newBuilder();
    }

    public static MobileChannel.Builder newMobileChannelBuilder() {
        return MobileChannel.newBuilder();
    }

    public static MobileAppChannel.Builder newMobileAppChannelBuilder() {
        return MobileAppChannel.newBuilder();
    }

    public static PhoneChannel.Builder newPhoneChannelBuilder() {
        return PhoneChannel.newBuilder();
    }

    public static RetailChannel.Builder newRetailChannelBuilder() {
        return RetailChannel.newBuilder();
    }

    public static SmsChannel.Builder newSmsChannelBuilder() {
        return SmsChannel.newBuilder();
    }

    public static TerminalChannel.Builder newTerminalChannelBuilder() {
        return TerminalChannel.newBuilder();
    }

    public static TvAppChannel.Builder newTvAppChannelBuilder() {
        return TvAppChannel.newBuilder();
    }

}

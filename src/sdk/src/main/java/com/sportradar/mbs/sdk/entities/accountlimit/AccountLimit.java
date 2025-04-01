package com.sportradar.mbs.sdk.entities.accountlimit;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DepositAccountLimit.class, name = "deposit"),
        @JsonSubTypes.Type(value = LossAccountLimit.class, name = "loss"),
        @JsonSubTypes.Type(value = SessionAccountLimit.class, name = "session"),
        @JsonSubTypes.Type(value = StakeAccountLimit.class, name = "stake")
})
public abstract class AccountLimit {

    public static DepositAccountLimit.Builder newDepositAccountLimitBuilder() {
        return DepositAccountLimit.newBuilder();
    }

    public static LossAccountLimit.Builder newLossAccountLimitBuilder() {
        return LossAccountLimit.newBuilder();
    }

    public static SessionAccountLimit.Builder newSessionAccountLimitBuilder() {
        return SessionAccountLimit.newBuilder();
    }

    public static StakeAccountLimit.Builder newStakeAccountLimitBuilder() {
        return StakeAccountLimit.newBuilder();
    }

}

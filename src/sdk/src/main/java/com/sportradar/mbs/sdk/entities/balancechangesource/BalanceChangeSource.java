package com.sportradar.mbs.sdk.entities.balancechangesource;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DepositBalanceChangeSource.class, name = "deposit"),
        @JsonSubTypes.Type(value = TicketBalanceChangeSource.class, name = "ticket"),
        @JsonSubTypes.Type(value = WithdrawalBalanceChangeSource.class, name = "withdrawal")
})
public abstract class BalanceChangeSource {

    public static DepositBalanceChangeSource.Builder newDepositBalanceChangeSourceBuilder() {
        return DepositBalanceChangeSource.newBuilder();
    }

    public static TicketBalanceChangeSource.Builder newTicketBalanceChangeSourceBuilder() {
        return TicketBalanceChangeSource.newBuilder();
    }

    public static WithdrawalBalanceChangeSource.Builder newWithdrawalBalanceChangeSourceBuilder() {
        return WithdrawalBalanceChangeSource.newBuilder();
    }

}

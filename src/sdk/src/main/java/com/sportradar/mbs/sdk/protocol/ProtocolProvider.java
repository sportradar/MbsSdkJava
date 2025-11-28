package com.sportradar.mbs.sdk.protocol;

public interface ProtocolProvider {

    TicketProtocol getTicketProtocol();

    AccountProtocol getAccountProtocol();

    BalanceProtocol getBalanceProtocol();

    GamingProtocol getGamingProtocol();
}

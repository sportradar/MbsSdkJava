package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.protocol.*;

public class ProtocolProviderImpl implements ProtocolProvider {

    private final TicketProtocol ticketProtocol;
    private final AccountProtocol accountProtocol;
    private final BalanceProtocol balanceProtocol;
    private final GamingProtocol gamingProtocol;

    public ProtocolProviderImpl(final long operatorId, final ProtocolEngine engine) {
        this.ticketProtocol = new TicketProtocolImpl(operatorId, engine);
        this.accountProtocol = new AccountProtocolImpl(operatorId, engine);
        this.balanceProtocol = new BalanceProtocolImpl(operatorId, engine);
        this.gamingProtocol = new GamingProtocolImpl(operatorId, engine);
    }

    @Override
    public TicketProtocol getTicketProtocol() {
        return ticketProtocol;
    }

    @Override
    public AccountProtocol getAccountProtocol() {
        return accountProtocol;
    }

    @Override
    public BalanceProtocol getBalanceProtocol() {
        return balanceProtocol;
    }

    @Override
    public GamingProtocol getGamingProtocol() {
        return gamingProtocol;
    }
}

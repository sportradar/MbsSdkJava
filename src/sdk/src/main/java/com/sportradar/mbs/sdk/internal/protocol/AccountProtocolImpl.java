package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.AccountStatusInformRequest;
import com.sportradar.mbs.sdk.entities.response.AccountStatusInformResponse;
import com.sportradar.mbs.sdk.protocol.AccountProtocol;

import java.util.concurrent.CompletableFuture;

public class AccountProtocolImpl implements AccountProtocol {

    private final ProtocolEngine engine;

    public AccountProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    @Override
    public CompletableFuture<AccountStatusInformResponse> sendAccountStatusAsync(final AccountStatusInformRequest request) {
        return engine.execute("account-status-inform", request, AccountStatusInformResponse.class);
    }
}

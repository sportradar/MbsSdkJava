package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.CasinoSessionsRequest;
import com.sportradar.mbs.sdk.entities.response.CasinoSessionsResponse;
import com.sportradar.mbs.sdk.protocol.GamingProtocol;

import java.util.concurrent.CompletableFuture;

public class GamingProtocolImpl implements GamingProtocol {
    private final ProtocolEngine engine;

    public GamingProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    @Override
    public CompletableFuture<CasinoSessionsResponse> sendCasinoSessionAsync(CasinoSessionsRequest request) {
        return engine.execute("casino-sessions-inform", request, CasinoSessionsResponse.class);
    }
}

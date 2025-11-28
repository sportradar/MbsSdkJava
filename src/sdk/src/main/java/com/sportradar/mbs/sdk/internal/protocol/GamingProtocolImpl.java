package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.CasinoSessionsRequest;
import com.sportradar.mbs.sdk.entities.response.CasinoSessionsResponse;
import com.sportradar.mbs.sdk.protocol.GamingProtocol;

import java.util.concurrent.CompletableFuture;

public class GamingProtocolImpl implements GamingProtocol {

    /**
     * The operator identifier.
     */
    private final long operatorId;
    private final ProtocolEngine engine;

    public GamingProtocolImpl(final long operatorId, final ProtocolEngine engine) {
        this.operatorId = operatorId;
        this.engine = engine;
    }

    @Override
    public CompletableFuture<CasinoSessionsResponse> sendCasinoSessionAsync(CasinoSessionsRequest request) {
        return engine.execute(this.operatorId, "casino-sessions-inform", request, CasinoSessionsResponse.class);
    }
}

package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.CasinoSessionsRequest;
import com.sportradar.mbs.sdk.entities.response.CasinoSessionsResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface GamingProtocol {
    default CasinoSessionsResponse sendCasinoSession(CasinoSessionsRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendCasinoSessionAsync(request).get();
    }

    CompletableFuture<CasinoSessionsResponse> sendCasinoSessionAsync(CasinoSessionsRequest request);
}

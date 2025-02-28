package com.sportradar.mbs.sdk.internal.config;

import java.net.URI;
import java.time.Duration;

public interface WebSocketConnectionConfig {

    URI getWsServer();

    Duration getWsReconnectTimeout();

    Duration getWsFetchMessageTimeout();

    Duration getWsSendMessageTimeout();

    Duration getWsReceiveMessageTimeout();

    Duration getWsConsumerGraceTimeout();

    Duration getWsRefreshConnectionTimeout();

    Duration getWsPingInterval();
}

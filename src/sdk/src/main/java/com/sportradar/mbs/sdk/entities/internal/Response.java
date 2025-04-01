package com.sportradar.mbs.sdk.entities.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.response.ContentResponse;

public class Response {

    @JsonProperty("correlationId")
    private String correlationId;
    @JsonProperty("timestampUtc")
    private long timestampUtc;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("version")
    private String version;
    @JsonProperty("content")
    private ContentResponse content;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCorrelationId() {
        return this.correlationId;
    }

    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    public long getTimestampUtc() {
        return this.timestampUtc;
    }

    public void setTimestampUtc(long value) {
        this.timestampUtc = value;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String value) {
        this.operation = value;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public ContentResponse getContent() {
        return this.content;
    }

    public void setContent(ContentResponse value) {
        this.content = value;
    }

    public static class Builder {

        private final Response instance = new Response();

        private Builder() {
        }

        public Response build() {
            return this.instance;
        }

        public Builder setCorrelationId(String value) {
            this.instance.setCorrelationId(value);
            return this;
        }

        public Builder setTimestampUtc(long value) {
            this.instance.setTimestampUtc(value);
            return this;
        }

        public Builder setOperation(String value) {
            this.instance.setOperation(value);
            return this;
        }

        public Builder setVersion(String value) {
            this.instance.setVersion(value);
            return this;
        }

        public Builder setContent(ContentResponse value) {
            this.instance.setContent(value);
            return this;
        }
    }
}

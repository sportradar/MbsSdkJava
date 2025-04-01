package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.CasinoContext;
import com.sportradar.mbs.sdk.entities.common.CasinoSession;

import java.util.List;

public class CasinoSessionsRequest extends ContentRequest {

    @JsonProperty("sessions")
    private CasinoSession[] sessions;
    @JsonProperty("reportId")
    private String reportId;
    @JsonProperty("context")
    private CasinoContext context;

    public static Builder newBuilder() {
        return new Builder();
    }

    public CasinoSession[] getSessions() {
        return this.sessions;
    }

    public void setSessions(CasinoSession[] value) {
        this.sessions = value;
    }

    public String getReportId() {
        return this.reportId;
    }

    public void setReportId(String value) {
        this.reportId = value;
    }

    public CasinoContext getContext() {
        return this.context;
    }

    public void setContext(CasinoContext value) {
        this.context = value;
    }

    public static class Builder {

        private final CasinoSessionsRequest instance = new CasinoSessionsRequest();

        private Builder() {
        }

        public CasinoSessionsRequest build() {
            return this.instance;
        }

        public Builder setSessions(CasinoSession... value) {
            this.instance.setSessions(value);
            return this;
        }

        public Builder setSessions(List<? extends CasinoSession> value) {
            CasinoSession[] arr = value == null ? null : value.toArray(new CasinoSession[0]);
            return this.setSessions(arr);
        }

        public Builder setReportId(String value) {
            this.instance.setReportId(value);
            return this;
        }

        public Builder setContext(CasinoContext value) {
            this.instance.setContext(value);
            return this;
        }
    }
}

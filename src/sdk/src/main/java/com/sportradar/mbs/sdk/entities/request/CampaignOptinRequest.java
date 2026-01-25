package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class CampaignOptinRequest extends ContentRequest {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("campaignId")
    private String campaignId;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWalletId() {
        return this.walletId;
    }

    public void setWalletId(String value) {
        this.walletId = value;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    public EndCustomer getEndCustomer() {
        return this.endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        this.endCustomer = value;
    }

    public static class Builder {

        private final CampaignOptinRequest instance = new CampaignOptinRequest();

        private Builder() {
        }

        public CampaignOptinRequest build() {
            return this.instance;
        }

        public Builder setWalletId(String value) {
            this.instance.setWalletId(value);
            return this;
        }

        public Builder setCampaignId(String value) {
            this.instance.setCampaignId(value);
            return this;
        }

        public Builder setEndCustomer(EndCustomer value) {
            this.instance.setEndCustomer(value);
            return this;
        }
    }
}

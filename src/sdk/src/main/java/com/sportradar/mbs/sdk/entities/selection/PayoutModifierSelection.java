package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PayoutModifierSelection extends Selection {

    @JsonProperty("reference")
    private String reference;
    @JsonProperty("selection")
    private Selection selection;
    @JsonProperty("description")
    private String description;

    public String getReference() {
        return this.reference;
    }

    public void setReference(String value) {
        this.reference = value;
    }

    public Selection getSelection() {
        return this.selection;
    }

    public void setSelection(Selection value) {
        this.selection = value;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String value) {
        this.description = value;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final PayoutModifierSelection instance = new PayoutModifierSelection();

        private Builder() {
        }

        public PayoutModifierSelection build() {
            return this.instance;
        }

        public Builder setReference(String value) {
            this.instance.setReference(value);
            return this;
        }

        public Builder setSelection(Selection value) {
            this.instance.setSelection(value);
            return this;
        }

        public Builder setDescription(String value) {
            this.instance.setDescription(value);
            return this;
        }
    }
}

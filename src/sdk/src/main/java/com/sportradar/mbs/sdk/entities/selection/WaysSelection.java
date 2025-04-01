package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WaysSelection extends Selection {

    @JsonProperty("selections")
    private Selection[] selections;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Selection[] getSelections() {
        return this.selections;
    }

    public void setSelections(Selection[] value) {
        this.selections = value;
    }

    public static class Builder {

        private final WaysSelection instance = new WaysSelection();

        private Builder() {
        }

        public WaysSelection build() {
            return this.instance;
        }

        public Builder setSelections(Selection... value) {
            this.instance.setSelections(value);
            return this;
        }

        public Builder setSelections(List<? extends Selection> value) {
            Selection[] arr = value == null ? null : value.toArray(new Selection[0]);
            return this.setSelections(arr);
        }
    }
}

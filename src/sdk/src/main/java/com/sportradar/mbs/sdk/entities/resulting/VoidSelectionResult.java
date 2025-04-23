package com.sportradar.mbs.sdk.entities.resulting;

public class VoidSelectionResult extends SelectionResult {

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final VoidSelectionResult instance = new VoidSelectionResult();

        private Builder() {
        }

        public VoidSelectionResult build() {
            return this.instance;
        }
    }
}

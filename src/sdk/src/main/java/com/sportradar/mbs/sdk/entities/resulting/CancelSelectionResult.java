package com.sportradar.mbs.sdk.entities.resulting;

public class CancelSelectionResult extends SelectionResult {

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final CancelSelectionResult instance = new CancelSelectionResult();

        private Builder() {
        }

        public CancelSelectionResult build() {
            return this.instance;
        }
    }
}

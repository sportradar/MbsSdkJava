package com.sportradar.mbs.sdk.entities.resulting;

public class UnsettledSelectionResult extends SelectionResult {

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final UnsettledSelectionResult instance = new UnsettledSelectionResult();

        private Builder() {
        }

        public UnsettledSelectionResult build() {
            return this.instance;
        }
    }
}

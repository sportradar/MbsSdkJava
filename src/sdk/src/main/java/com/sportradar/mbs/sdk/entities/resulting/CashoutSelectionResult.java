package com.sportradar.mbs.sdk.entities.resulting;

public class CashoutSelectionResult extends SelectionResult {

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final CashoutSelectionResult instance = new CashoutSelectionResult();

        private Builder() {
        }

        public CashoutSelectionResult build() {
            return this.instance;
        }
    }
}

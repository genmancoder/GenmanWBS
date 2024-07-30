package com.genman.wbs.logging;

/**
 *
 * @author Admin
 */
public enum Level {
    SEVERE, WARNING, INFO;

    int getValue() {
        switch (this) {
            case SEVERE:
                return 3;
            case WARNING:
                return 2;
            default:
                return 1;
        }
    }

    boolean greaterThanEqualTo(Level level) {
        return this.getValue() >= level.getValue();
    }
}

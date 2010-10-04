package com.code.google.reprapstudio.contol;

import org.reprap.CartesianPrinter;

/**
 *
 * @author ekohlwey
 */
public class ContinuationEvent {

    private final String message;
    private final CartesianPrinter source;

    public ContinuationEvent(String message, CartesianPrinter source) {
        this.message = message;
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public CartesianPrinter getSource() {
        return source;
    }
}

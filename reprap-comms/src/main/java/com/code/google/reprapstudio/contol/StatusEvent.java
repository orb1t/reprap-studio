/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.code.google.reprapstudio.contol;

import org.reprap.CartesianPrinter;

/**
 *
 * @author ekohlwey
 */
public class StatusEvent {
    private final String message;
    private final Status status;
    private final CartesianPrinter origin;

    public static enum Status {
        ALERT, CANCELLED
    }

    public StatusEvent(String message, Status status, CartesianPrinter origin) {
        this.message = message;
        this.status = status;
        this.origin = origin;
    }

    public String getMessage() {
        return message;
    }

    public CartesianPrinter getOrigin() {
        return origin;
    }

    public Status getStatus() {
        return status;
    }


}

package com.code.google.reprapstudio.contol;

/**
 * A control class following the MVC design pattern for dispatching
 * events related the Cartesian Robot.
 * @author ekohlwey
 */
public class CartesianPrinterControl {



    /**
     * Notifies all continuation event listeners that an event occurred.
     * Blocks until all the listeners have processed the continuation event.
     * @param event
     */
     public static void continuationEventOccured(ContinuationEvent event){
        
    }

     public static void printerStatusChanged(StatusEvent event){

     }

}

package com.ecommerce.Threads;

public class PrintNumber implements Runnable {
    int numtoprint;
    public PrintNumber(int numtoprint) {
        this.numtoprint = numtoprint;
    }
    public void run() {
        System.out.println("Printing in thread: "+Thread.currentThread().getName() + " numtoprint " + numtoprint);
    }
}

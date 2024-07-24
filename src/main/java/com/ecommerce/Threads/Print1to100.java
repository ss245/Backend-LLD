package com.ecommerce.Threads;

public class Print1to100 implements Runnable{
    int numPrint;
    public Print1to100(int numPrint) {
        this.numPrint = numPrint;
    }
    public void run() {
        System.out.println("Printing number "+ numPrint + " using thread " + Thread.currentThread().getName());
    }
}

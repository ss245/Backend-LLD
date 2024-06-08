package com.ecommerce.Threads;

public class PrintHelloWorld implements Runnable {
    public void run() {
        System.out.println("Hello World!");
        System.out.println("Printing Hello World in Thread: "+Thread.currentThread().getName());
    }
}

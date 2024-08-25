package com.ecommerce.Threads;

public class PrintHelloIIITian implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello IIITian!");
        System.out.println("Printing int the thread having thread name: "+ Thread.currentThread().getName());
    }
}

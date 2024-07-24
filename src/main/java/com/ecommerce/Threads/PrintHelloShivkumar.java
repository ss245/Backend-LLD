package com.ecommerce.Threads;

public class PrintHelloShivkumar implements Runnable{
    public void run(){
        System.out.println("Hello Shivkumar");
        System.out.println("Printing Hello Shivkumar in thread: "+ Thread.currentThread().getName());
    }

}

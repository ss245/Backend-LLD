package com.ecommerce.Threads;

public class PrintPositiveInteger implements Runnable{
    int number;
    public PrintPositiveInteger(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Printing positive integer in thread: "+ Thread.currentThread().getName()+ " Integer "+ number);
    }
}

package com.ecommerce.Executors;

public class PrintNumber implements Runnable{

    int number;
    public PrintNumber(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Printing number in thread : " + Thread.currentThread().getName()+ " Number " +number);
    }
}

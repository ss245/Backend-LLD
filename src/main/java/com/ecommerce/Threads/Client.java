package com.ecommerce.Threads;

public class Client {
    static void doSomething(){
        System.out.println("Printing something in thread: "+ Thread.currentThread().getName());
    }
    public static void main(String args[]){
//        System.out.println("Thread name:  "+Thread.currentThread().getName());
//        doSomething();
//        PrintHelloWorld task1 = new PrintHelloWorld();
//        Thread thread1 = new Thread(task1);
//        thread1.start();
//        PrintNumber task2 = new PrintNumber(1);
//        Thread thread2 = new Thread(task2);
//        thread2.start();

//        " Printing all numers from 1 to 100:"
         for(int i=0;i<100;i++) {
             PrintNumber task = new PrintNumber(i);
             Thread thread = new Thread(task);
             thread.start();
         }
    }

}

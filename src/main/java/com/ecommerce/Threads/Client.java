package com.ecommerce.Threads;

import java.net.SocketOption;

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
//         for(int i=0;i<100;i++) {
//             PrintNumber task = new PrintNumber(i);
//             Thread thread = new Thread(task);
//             thread.start();
//         }
//        System.out.println("Printing something in main thread: "+ Thread.currentThread().getName());
//
//         PrintHelloShivkumar task = new PrintHelloShivkumar();
//         Thread thread = new Thread(task);
//         thread.start();
//
//         // Printing numbers from 1 to 100
//        for(int i=1 ; i<=100 ; i++){
//            Print1to100 task1 = new Print1to100(i);
//            Thread thread1 = new Thread(task1);
//            thread1.start();
//        }

        System.out.println("Printing something in main thread: "+ Thread.currentThread().getName());
        doSomething();
        /*
        I want to give this task of printing "Hello IIITian" to new thread. For that you have to create
        a new task of printing hello iiitian.
         */
        System.out.println("Hello IIITian");
        PrintHelloIIITian printHelloIIITian = new PrintHelloIIITian();
        Thread thread = new Thread(printHelloIIITian);
        thread.start();

        /*
        To print number I will create different task and gives it to new thread.
         */

        for(int i=0;i<100;i++){
            PrintPositiveInteger printPositiveInteger = new PrintPositiveInteger(i);
            Thread thread1 = new Thread(printPositiveInteger);
            thread1.start();
        }
    }

}

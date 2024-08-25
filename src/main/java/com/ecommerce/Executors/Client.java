package com.ecommerce.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++){
            PrintNumber printNumber = new PrintNumber(i);
            ex.submit(printNumber);
        }
    }
}

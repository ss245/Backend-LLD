package com.ecommerce.AdderSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();
        ExecutorService ex = Executors.newCachedThreadPool();

        Adder a = new Adder(count,lock);
        Subtractor b = new Subtractor(count,lock);

        Future<Void>res1 =  ex.submit(a);
        Future<Void>res2 =  ex.submit(b);

        res1.get();
        res2.get();

        System.out.println(count.val);

    }
}

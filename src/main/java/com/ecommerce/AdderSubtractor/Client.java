package com.ecommerce.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();

        ExecutorService ex = Executors.newCachedThreadPool();

        Adder a = new Adder(count);
        Subtractor b = new Subtractor(count);

        Future<Void>res1 =  ex.submit(a);
        Future<Void>res2 =  ex.submit(b);

        res1.get();
        res2.get();

        System.out.println(count.val);

    }
}

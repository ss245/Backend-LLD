package com.ecommerce.MergeSortMultiThreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();

        List<Integer>ls = List.of(1,2,2,3,4,1,5,3,6,9,4,7,8);

        Sorter s  = new Sorter(ls,ex);
        Future<List<Integer>> res = ex.submit(s);
        ls = res.get();

        System.out.println(ls);

    }
}

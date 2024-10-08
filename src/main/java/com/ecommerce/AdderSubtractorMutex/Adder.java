package com.ecommerce.AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Count count;
    Lock lock;
    Adder(Count count, Lock lock) {

        this.count = count;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            lock.lock();
            count.val+=i;
            lock.unlock();
        }
        return null;
    }
}

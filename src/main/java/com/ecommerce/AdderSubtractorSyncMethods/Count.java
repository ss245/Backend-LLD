package com.ecommerce.AdderSubtractorSyncMethods;

public class Count {
    int val=0;

    public synchronized void incrementbyx(int x) {
        val+=x;
    }

    public synchronized void decrementbyx(int x) {
        val-=x;
    }
}

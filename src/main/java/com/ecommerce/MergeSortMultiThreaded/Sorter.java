package com.ecommerce.MergeSortMultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;

    ExecutorService ex;
    public Sorter(List<Integer> arrayToSort, ExecutorService ex) {
        this.arrayToSort = arrayToSort;
        this.ex=ex;
    }
    @Override
    public List<Integer> call() throws Exception {
        int n=arrayToSort.size();
        if(n==1) return arrayToSort;
        int m=arrayToSort.size()/2;
        List<Integer> LeftHalf = arrayToSort.subList(0, m);
        List<Integer> RightHalf = arrayToSort.subList(m, arrayToSort.size());

        Sorter task1 = new Sorter(LeftHalf, ex);
        Sorter task2 = new Sorter(RightHalf, ex);

        Future<List<Integer>>LeftSortedArray = ex.submit(task1);
        Future<List<Integer>>RightSortedArray = ex.submit(task2);

        LeftHalf= LeftSortedArray.get();
        RightHalf= RightSortedArray.get();

        List<Integer>MergedArray = new ArrayList<Integer>();
        int i=0,j=0;
        while(i<LeftHalf.size() && j<RightHalf.size()){
            if(LeftHalf.get(i).compareTo(RightHalf.get(j))<0){
                MergedArray.add(LeftHalf.get(i));
                i++;
            }
            else{
                MergedArray.add(RightHalf.get(j));
                j++;
            }
        }
        while(i<LeftHalf.size()){
            MergedArray.add(LeftHalf.get(i));
            i++;
        }
        while(j<RightHalf.size()){
            MergedArray.add(RightHalf.get(j));
            j++;
        }
        return MergedArray;
    }
}

package com.company.DPRevision;

public class Fibonacci {
    public static int fib(int n){
        // Base Case
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    private static int fibM(int n, int []storage){
        // Base Case
        if(n == 0 || n == 1){
            storage[n] = n;
            return storage[n];
        }
        // if result is already calculated
        if (storage[n] != -1){
            return storage[n];
        }
        // otherwise calculate Result
        return storage[n] = fibM(n-1, storage) + fibM(n-2, storage);
    }

    public static int fibM(int n){
        int []storage = new int[n+1];
        for(int i=0; i<storage.length; i++){
            storage[i] = -1;
        }
        return fibM(n, storage);
    }

    public static int fibDP(int n){
        int []storage = new int[n+1];
        // Store Results you know already
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2; i<storage.length; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }

    public static void main(String []args){
        int n = 9;
        System.out.println(fibDP(n));
        System.out.println(fibM(n));
        System.out.println(fib(n));

    }
}

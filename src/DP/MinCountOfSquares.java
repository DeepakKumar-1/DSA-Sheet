package com.company.DPRevision;

import java.util.Arrays;

public class MinCountOfSquares {
    public static int squareCount(int n){
        // Base Case
        if(n == 1 || n == 0){
            return n;
        }
        int minCount = Integer.MAX_VALUE;
        for(int i=1; i<=Math.sqrt(n); i++){
            int count = squareCount(n-(int)Math.pow(i, 2));
            if(minCount > count){
               minCount = count;
            }
        }
        return 1+minCount;
    }

    public static int squareCountM(int n){
        int []storage = new int[n+1];
        for (int i=0; i<storage.length; i++){
            storage[i] = -1;
        }
        return squareCountM(n, storage);
    }
    private static int squareCountM(int n, int []storage){
        // Base Case
        if(n == 1 || n == 0){
            storage[n] = n;
            return storage[n];
        }
        // if Result is already calculated
        if(storage[n] != -1){
            return storage[n];
        }
        // otherwise calculate the result
        int minCount = Integer.MAX_VALUE;
        for(int i=1; i<=(int)Math.sqrt(n); i++){
            int count = squareCountM(n-(int)Math.pow(i, 2), storage);
            if(count < minCount){
                minCount = count;
            }
        }
        storage[n] = 1+minCount;
        return storage[n];
    }

    // DP Approach
    public static int squareCountDP(int n){
        int []storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2; i<storage.length; i++){
            int minSteps = storage[i-1];
            for(int j=1; j<=(int)Math.sqrt(i); j++){
                if(minSteps > storage[i-j*j]){
                    minSteps = storage[i-j*j];
                }
            }
            storage[i] = 1+minSteps;
        }
        System.out.println(Arrays.toString(storage));
        return storage[n];
    }

    public static void main(String []args){
        int n = 200;
        System.out.println(squareCountM(n));
        System.out.println(squareCountDP(n));
        System.out.println(squareCount(n));
    }
}

package com.company.DPRevision;

public class MinStepsTo1 {
    // Recursion
    public static int countSteps(int n){
        // Base case
        if(n == 1){
            return 0;
        }

        int opt1 = countSteps(n-1);
        int minSteps = opt1;
        if(n % 3 == 0){
            int opt2 = countSteps(n/3);
            if(opt2 < minSteps){
                minSteps = opt2;
            }
        }
        if(n % 2 == 0) {
            int opt3 = countSteps(n/2);
            if(opt3 < minSteps){
                minSteps = opt3;
            }
        }
        return 1+minSteps;
    }

    // Memoization Approach

    public static int countStepsM(int n){
        int []storage = new int[n+1];
        return countStepsM(n, storage);
    }
    private static int countStepsM(int n, int []storage){
        // Base Case
        if(n == 1){
            storage[n] = 0;
            return storage[n];
        }
        // if Result is Already Calculated
        if(storage[n] != 0){
            return storage[n];
        }
        // otherwise Calculate the result
        int opt1 = countStepsM(n-1, storage);
        int minSteps = opt1;
        if(n % 3 == 0){
            int opt2 = countStepsM(n/3, storage);
            if(minSteps > opt2){
                minSteps = opt2;
            }
        }
        if(n % 2 == 0){
            int opt3 = countStepsM(n/2, storage);
            if(opt3 < minSteps){
                minSteps = opt3;
            }
        }
        storage[n] = 1+minSteps;
        return storage[n];
    }

    // DP Approach
    public static int countStepsDP(int n){
        int []storage = new int[n+1];
        storage[1] = 0;
        for(int i=2; i<storage.length; i++){
            int minSteps = storage[i-1];
            if(i % 2 == 0 && minSteps > storage[i/2]){
                minSteps = storage[i/2];
            }
            if(i%3 == 0 && minSteps > storage[i/3]){
                minSteps = storage[i/3];
            }
            storage[i] = 1+minSteps;
        }
        return storage[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countStepsM(n));
        System.out.println(countSteps(n));
        System.out.println(countStepsDP(n));
    }
}


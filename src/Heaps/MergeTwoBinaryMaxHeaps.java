package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class MergeTwoBinaryMaxHeaps {
    public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int []arr = new int[m+n];
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            maxHeap.add(a[i]);
        }
        for(int i=0; i<m; i++){
            maxHeap.add(b[i]);
        }

        int i=0;
        while(!maxHeap.isEmpty()){
            arr[i] = maxHeap.poll();
            i++;
        }
        return arr;
    }

    public static void main(String []args){
        int []a = {10, 5, 6, 2};
        int []b = {12, 7, 9};
        int []res = mergeHeaps(a, b, a.length, b.length);
        System.out.println("Result is: " + Arrays.toString(res));
    }
}

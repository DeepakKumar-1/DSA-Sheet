package Heaps;

import java.util.PriorityQueue;
import java.util.Arrays;
public class MergeKSortedArray {

    public static int[] mergeKSortedArray(int [][]matrix, int k){
        int []arr = new int[k*k];
        // Add All Element into the Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int []a : matrix){
            for(int element : a){
                minHeap.add(element);
            }
        }

        // Remove All Elements from the Heap and add into the Array
        int i=0;
        while(!minHeap.isEmpty()){
            arr[i] = minHeap.poll();
            i++;
        }
        return  arr;
    }

    public static void main(String []args){
        int k = 4;
        int [][]arr={{1,2,3,4},{2,2,3,4},
                     {5,5,6,6},{7,8,9,9}};
        int []res = mergeKSortedArray(arr, k);
        System.out.println(Arrays.toString(res));
    }
}

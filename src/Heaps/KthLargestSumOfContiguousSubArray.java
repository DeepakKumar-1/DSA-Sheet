package Heaps;

import java.util.PriorityQueue;

public class KthLargestSumOfContiguousSubArray {

    public static int kthLargestSubArraySum(int []arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<arr.length-1; i++){
            int sum = arr[i];
            minHeap.add(sum);
            for(int j=i+1; j<arr.length; j++){
                sum += arr[j];
                minHeap.add(sum);
            }

        }

        // Find Kth Largest element of the minHeap
        while(minHeap.size() != 0 && minHeap.size() > k){
                minHeap.remove();
        }
        if(minHeap.size() > 0) {
            return minHeap.poll();
        }
        return -1;
    }

    public static void main(String []args){
        int []arr = {20, -5, -1};
        int k = 3;
        System.out.println( k + " Largest Sum is: " + kthLargestSubArraySum(arr, k));
    }
}

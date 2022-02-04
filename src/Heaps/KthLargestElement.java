package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static int kthLargest(int []arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : arr){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println("Kth Largest Element is: " + kthLargest(arr, k));

    }
}

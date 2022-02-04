package Heaps;

import java.util.Scanner;
import java.util.Arrays;

public class HeapSort {
    public static void insertInVirtualHead(int []arr, int i){
        int childIndex = i;
        int parentIndex = (childIndex - 1)/2;
        while(childIndex > 0){
            if(arr[childIndex] < arr[parentIndex]){
                //Swap
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                // Update Child And Parent index
                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
            } else{
                return;
            }
        }
    }

    public static int removeMinFromVirtualHeap(int []arr, int heapSize){
        int temp = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;
        // DownWard Heapify
        int index = 0;
        int leftChildIndex = (2*index) + 1;
        int rightChildIndex = (2*index) + 2;
        while (leftChildIndex < heapSize){
            int minIndex = index;
            if(arr[leftChildIndex] < arr[minIndex])
                minIndex = leftChildIndex;
            if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex])
                minIndex = rightChildIndex;
            if(minIndex != index){
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex] = temp1;
                index = minIndex;
                leftChildIndex = (2 * index) + 1;
                rightChildIndex = (2 * index) + 2;
            } else{
                break;
            }
        }
        return temp;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Array Before Sorting
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            insertInVirtualHead(arr, i);
        }

        for(int i=0; i<arr.length; i++){
            arr[arr.length - 1 - i] = removeMinFromVirtualHeap(arr, arr.length - i);
        }
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }
}

package Heaps;

import java.util.Arrays;
import java.util.Scanner;

public class ImplementMinHeapUsingArrays {

    // Recursive heapify-up algorithm
    public static void upHeapify(int []arr, int i)
    {
        // check if the node at index `i` and its parent violate the heap property
        if (i >= 0 && arr[parent(i)] > arr[i])
        {
            // swap the two if heap property is violated
            swap(arr, i, parent(i));

            // call heapify-up on the parent
            upHeapify(arr, parent(i));
        }
    }

    public static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int parent(int i){
        return (i - 1)/2;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        upHeapify(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

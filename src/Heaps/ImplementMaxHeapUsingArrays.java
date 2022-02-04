package Heaps;

import java.util.Scanner;
import java.util.Arrays;

public class ImplementMaxHeapUsingArrays {
    public static void downHeapify(int []arr, int rootIndex){
        // Initializing Root as Largest element
        int largest = rootIndex;
        // find its left and Right Child
        int leftChild = 2*rootIndex + 1;
        int rightChild = 2*rootIndex + 2;
        // if leftChild is Smallest than root
        if(leftChild < arr.length && arr[leftChild] > arr[largest]){
            largest = leftChild;
        }
        // if rightChild is Smallest than root
        if(rightChild < arr.length && arr[rightChild] > arr[largest]){
            largest = rightChild;
        }
        // if Smallest is not root than Swap
        if(largest != rootIndex){
            int temp = arr[largest];
            arr[largest] = arr[rootIndex];
            arr[rootIndex] = temp;
            downHeapify(arr, largest);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Index of the Last Non Leaf Node
        int startIndex = (n/2) - 1;
        for(int i=startIndex ; i>=0; i--){
            downHeapify(arr, i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

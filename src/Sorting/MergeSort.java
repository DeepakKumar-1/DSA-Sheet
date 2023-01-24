package Sorting;
import java.util.*;

public class MergeSort {
    public static void merge(int []arr, int start, int mid, int end){
        // Create New Array B of same length as arr
        int []B = new int[arr.length];
        int i=start;
        int j=mid+1;
        int k = start;
        // Start filling B
        while(i <= mid && j <= end){
            if(arr[i] > arr[j]){
                B[k] = arr[j];
                j++;
            }else{
                B[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<=mid){
            B[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end){
            B[k] = arr[j];
            j++;
            k++;
        }

        // Copy B in arr
        for(int l=start; l<=end; l++){
            arr[l] = B[l];
        }
    }
    public static void mergeSort(int []arr, int start, int end){
        if(start < end){
            // Find mid of Array
            int mid = start + (end - start)/2;
            // Apply Merge Sort on First half
            mergeSort(arr, start, mid);
            // Apply Merge Sort on Second half
            mergeSort(arr, mid+1, end);
            // merge both halves
            merge(arr, start, mid, end);
        }
    }
    public static void mergeSort(int []arr){
        mergeSort(arr, 0, arr.length-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // Take Size of Array
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        // Declare Array of required Size
        int [] arr = new int[n];
        // Fill the Array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Display Array Before Sorting
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Array After Sorting: " + Arrays.toString(arr));

    }
}

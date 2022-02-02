package Arrays;

import java.util.*;
public class InversionCount {
    public static int merge(int []arr, int l, int mid, int r){
        int inv = 0;
        int i = l;
        int j = mid + 1;
        int k = l;
        int [] mix  = new int[arr.length];

        while(i <= mid && j <= r){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            } else{
                inv += (mid - l + 1) - 1;
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        // Above loop will end Only when Either i or j is Not Complete
        // if i is not Completed the Copy all the Element of i to mix Array
        while(i <= mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j <= r){
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Now Sorted Array in the Main Array
        for(int c = l; c <= r; c++){
            arr[c] = mix[c];
        }
        System.out.println(Arrays.toString(arr));
        return inv;
    }
    public static int mergeSort(int []arr, int l, int r){
        int inv = 0;
        if(l < r){
            int mid = (r+l)/2;
            inv += mergeSort(arr, l , mid);
            inv += mergeSort(arr, mid+1, r);
            inv += merge(arr, l, mid, r);
        }
        return inv;
    }
    public static void main(String []args){
        int []arr = {2, 4, 1, 3, 5};
        System.out.println("Initial Array: " + Arrays.toString(arr));
        int count = mergeSort(arr, 0, arr.length-1);
        System.out.println("Final Array: " + Arrays.toString(arr));
        System.out.println("Inversion Count of Array is: " + count);
    }
}

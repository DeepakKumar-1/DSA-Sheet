package Searching;
import java.util.*;

public class BinarySearchRecursive {
    public static int binarySearch(int []arr, int key, int start, int end){
        if(start > end){
            return -1;
        }
        // find mid
        int mid = start + (end - start)/2;
        if(arr[mid] == key){
            return mid;
        } else if(arr[mid] > key){
            return binarySearch(arr, key, start, mid-1);
        }
        return binarySearch(arr, key, mid+1, end);
    }
    public static int binarySearch(int []arr, int key){
        return binarySearch(arr, key, 0, arr.length-1);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        // Declare Array of Size n
        int []arr = new int[n];
        // Take Array Elements
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Take Key Element to Search
        System.out.print("Enter key Element to Search: ");
        int key = sc.nextInt();
        int res = binarySearch(arr, key);
        if(res != -1){
            System.out.println(key  + " Found at index " + res);
        }else{
            System.out.println(key + " is not Found in Array " + Arrays.toString(arr));
        }

    }
}

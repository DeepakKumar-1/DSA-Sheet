package Searching;
import java.util.*;

public class BinarySearch {
    public static int binarySearch(int []arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // find mid
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // Take Size of Array
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Take key That User want to Find
        System.out.print("Enter Key That You Want to Find: ");
        int key = sc.nextInt();
        int res = binarySearch(arr, key);
        if(res != -1){
            System.out.println(key + " Found at Index " + res);
        }else{
            System.out.println(key + " is not Found in array " + Arrays.toString(arr));
        }

    }
}

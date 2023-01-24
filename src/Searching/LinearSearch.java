package Searching;
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int []arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);
        // Take Length of Array
        int n = sc.nextInt();
        int []arr = new int[n];
        // Take Array Elements
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Key That You Want to Search: ");
        int key = sc.nextInt();
        int res = linearSearch(arr, key);
        if(res != -1){
            System.out.println(key + " Found at Index " + res);
        }else{
            System.out.println(key + " is Not Found in Array " + Arrays.toString(arr));
        }
    }
}

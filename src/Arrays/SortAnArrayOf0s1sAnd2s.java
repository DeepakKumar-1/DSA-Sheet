package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SortAnArrayOf0s1sAnd2s {
    public static void sort(int []arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<3; i++){
            map.put(i, 0);
        }

        for(int i=0; i<arr.length; i++){
            int key = arr[i];
                map.put(key, map.get(key) + 1);
        }

        for(int i=0,j=0; i<3; i++){
            int key = map.get(i);
            while(key-- > 0){
                arr[j++] = i;
            }
        }
    }

    public static void main(String []args){
        int []arr = {0, 1, 0, 2, 1, 0};
        System.out.println("Initial Array is: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Final Array is: " + Arrays.toString(arr));
    }
}

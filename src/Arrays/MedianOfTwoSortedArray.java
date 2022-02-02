package Arrays;

import java.util.HashMap;

public class MedianOfTwoSortedArray {
    public static int median(int []arr1, int []arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2){
            if(arr1[i] > arr2[j]){
                map.put(index, arr2[j]);
                j++;
                index++;
            } else{
                map.put(index, arr1[i]);
                i++;
                index++;
            }
        }
        while(i < n1){
            map.put(index, arr1[i]);
            i++;
            index++;
        }
        while(j < n2){
            map.put(index, arr2[j]);
            j++;
            index++;
        }
        // Find Median
        int totalSize = (n1+n2);
        // When EVEN
        if(totalSize % 2 == 0){
            int m1 = totalSize/2;
            int m2 = totalSize/2 - 1;
            return (map.get(m1) + map.get(m2))/2;
        } else{
            return map.get(totalSize/2);
        }
    }

    public static void main(String []args){
        int []arr1 = {2, 3, 5, 8};
        int []arr2 = {10, 12, 14, 16, 18, 20};
        System.out.println("Median is: " + median(arr1, arr2));
    }
}

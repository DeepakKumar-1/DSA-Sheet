package Arrays;

import java.util.HashMap;

public class FindDuplicateInArray {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int key : nums){
            if(map.containsKey(key)){
                return key;
            } else {
                map.put(key, true);
            }
        }
        return -1;
    }

    public static void main(String []args){
        int []arr = {1, 3, 2, 5, 5};
        System.out.println("Duplicate Element is: " + findDuplicate(arr));
    }
}

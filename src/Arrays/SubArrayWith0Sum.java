package Arrays;

import java.util.HashSet;

public class SubArrayWith0Sum {
    public static boolean subArray(int []arr){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            set.add(sum);
            sum += arr[i];
            if(set.contains(sum)){
                return true;
            }
        }
        return false;
    }

    public static void main(String []args){
        int []arr = {4, 2, -3, 1, 6};
        System.out.println("Has SubArray with 0 Sum: " + subArray(arr));
    }
}

package Arrays;
import java.util.Arrays;

public class KadanesAlgorithm {
    public static int kadanesAlgorithm(int []arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String []args){
        int []arr = {1, 9, -10, 7, 8};
        System.out.println("Array is: " + Arrays.toString(arr));
        System.out.println("Max Sub Array sum is: " + kadanesAlgorithm(arr));
    }
}

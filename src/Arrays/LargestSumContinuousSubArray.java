package Arrays;

import java.util.Arrays;

public class LargestSumContinuousSubArray {
    public static int maxSubarraySum(int []arr){
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
        int []arr = {1, 2, 3, 4, -5, 6, -7, -8, -9, 10};
        System.out.println("Array is: " + Arrays.toString(arr));
        System.out.println("Max Sub Array sum is: " + maxSubarraySum(arr));
    }
}

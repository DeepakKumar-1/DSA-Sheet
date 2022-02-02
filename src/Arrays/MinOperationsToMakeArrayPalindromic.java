package Arrays;

public class MinOperationsToMakeArrayPalindromic {
    public static int minOps(int []arr){
        int ans = 0;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            if(arr[start] == arr[end]){
                start++;
                end--;
            }
            // If left element is greater, then
            // we merge right two elements
            else if(arr[start] > arr[end]){
                end--;
                arr[end] += arr[end+1];
                ans++;
            }
            // Else we merge left two elements
            else{
                start++;
                arr[start] += arr[start-1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String []args){
        int []arr = {11, 14, 15, 99};
        System.out.println("Minimum Operations Required to Make Array Palindromic: " + minOps(arr));
    }
}

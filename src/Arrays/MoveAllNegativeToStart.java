package Arrays;
import java.util.Arrays;

public class MoveAllNegativeToStart {
    public static void rearrange(int []arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){

            if(arr[start] < 0 && arr[end] < 0){
                start++;
            } else if(arr[start] > 0 && arr[end] < 0){
                // Swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if(arr[start] > 0 && arr[end] > 0){
                end--;
            } else{
                start++;
                end--;
            }
        }
    }
    public static void main(String []args){
        int []arr = {1, 2, 3, 4, -1, -5, -7};
        System.out.println("Initial Array is: " + Arrays.toString(arr));
        rearrange(arr);
        System.out.println("Final Array is: " + Arrays.toString(arr));
    }
}

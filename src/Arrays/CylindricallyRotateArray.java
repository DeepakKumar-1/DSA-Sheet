package Arrays;
import java.util.Arrays;
public class CylindricallyRotateArray {
    public static void rotate(int []arr){
        int n = arr.length - 1;
        int temp = arr[n];
        for(int i = n ; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String []args){
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial Array is: " + Arrays.toString(arr));
        rotate(arr);
        System.out.println("Final Array is: " + Arrays.toString(arr));
    }
}

package Arrays;

import java.util.Arrays;

public class ReverseTheArray {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Initial Array is: " + Arrays.toString(arr));
        reverse(arr, 0, arr.length - 1);
        System.out.println("Array after Reverse is: " + Arrays.toString(arr));

    }
}

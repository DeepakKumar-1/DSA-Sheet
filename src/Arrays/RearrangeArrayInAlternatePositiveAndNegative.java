package Arrays;

import java.util.*;

public class RearrangeArrayInAlternatePositiveAndNegative {
    public static void rearrange(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        // Step 1 : rearrange Array Such that Positive Elements are on left side and Negative on Right Side
        while (i <= j) {
            // There are Four Possibilities
            // Both are positive
            if (arr[i] > 0 && arr[j] > 0) {
                i++;
            }
            // Both are Negative
            else if (arr[i] < 0 && arr[j] < 0) {
                j--;
            }
            // First is Positive Second is Negative
            else if (arr[i] > 0 && arr[j] < 0) {
                i++;
                j--;
            }
            // First is Negative Second is Positive
            else {
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
        // Step 2 : Rearrange Array int alternate Positive and Negative Fashion
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // There are main three Possibilities
            // Both are Positive
            // Both are Negative
            if (arr[start] > 0 && arr[end] > 0 || arr[start] < 0 && arr[end] < 0) {
                // Do Nothing
                break;
            } else {
                // swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start += 2;
                end -= 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-5, 3, 4, 5, -6, -2, 8, 9, -1, -4};
        System.out.println("Initial Array is: " + Arrays.toString(arr));
        rearrange(arr);
        // Final Array
        System.out.println("Final Array is: " + Arrays.toString(arr));
    }
}

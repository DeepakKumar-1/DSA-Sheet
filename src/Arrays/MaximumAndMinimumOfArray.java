package Arrays;

class Pair{
    int min;
    int max;
    Pair(int min, int max){
        this.min = min;
        this.max = max;
    }
}

public class MaximumAndMinimumOfArray {

    public static Pair minMax(int []arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        return new Pair(min, max);
    }

    public static void main(String []args){
        int []arr = {1, 4, 2, 5, 6, 8};
        Pair ans = minMax(arr);
        System.out.println("Maximum Element is " + ans.max);
        System.out.println("Minimum Element is " + ans.min);
    }
}

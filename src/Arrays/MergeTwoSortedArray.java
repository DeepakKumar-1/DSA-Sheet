package Arrays;

public class MergeTwoSortedArray {
    public static void merge(int []arr1, int []arr2, int n, int m) {
        // code here
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
            }
        }

        while(i < n){
            System.out.print(arr1[i] + " ");
            i++;
        }
        while(j < m){
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
    public static void main(String []args){
        int []arr1 = {0, 1, 2, 3};
        int []arr2 = {5, 6, 7, 8, 9};
        merge(arr1, arr2, arr1.length, arr2.length);
    }
}

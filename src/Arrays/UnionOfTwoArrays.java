package Arrays;
import java.util.*;
public class UnionOfTwoArrays {
    public static int union(int []a, int []b){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : a){
            set.add(ele);
        }

        for(int ele : b){
            set.add(ele);
        }
        System.out.println(set);
        return set.size();
    }
    public static void main(String []args){
        int []a = {1, 2, 3, 5, 6, 7};
        int []b = {2, 3, 5, 6, 7, 1, 2, 4};
        System.out.println("Union Size: " + union(a, b));
    }
}

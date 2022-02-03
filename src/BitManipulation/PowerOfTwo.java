package BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        if(n > 0 && (n & n-1) == 0){
            System.out.println(n + " is Power of 2");
        } else {
            System.out.println(n + " is Not Power of 2");
        }
    }
}

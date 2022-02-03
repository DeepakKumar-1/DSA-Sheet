package BitManipulation;

import java.util.Scanner;

public class BitDifference {
    public static int countBitsFlip(int a, int b){

        // Your code here
        int k = a^b;
        return Integer.bitCount(k);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Bit Difference is: " + countBitsFlip(a, b));
    }
}

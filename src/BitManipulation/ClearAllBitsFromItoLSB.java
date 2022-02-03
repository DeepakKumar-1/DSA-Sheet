package BitManipulation;

import java.util.Scanner;

public class ClearAllBitsFromItoLSB {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        System.out.println("Binary Representation is: " + Integer.toBinaryString(n));
        int mask = ~((1<<i+1) - 1);
        int ans = n & mask;
        System.out.println("Final Ans is: " + Integer.toBinaryString(ans));
    }
}

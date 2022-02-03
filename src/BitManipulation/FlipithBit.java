package BitManipulation;

import java.util.Scanner;

public class FlipithBit {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        System.out.println("Before Flip: " + Integer.toBinaryString(n));
        int ans = n^(1<<(i-1));
        System.out.println("After Flip: " + Integer.toBinaryString(ans));
    }
}

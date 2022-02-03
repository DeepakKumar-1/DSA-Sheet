package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        System.out.println("Binary Representation is: " + Integer.toBinaryString(n));
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        System.out.println("Number of Set Bits are: " + count);
    }
}

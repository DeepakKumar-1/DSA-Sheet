package BitManipulation;

import java.util.Scanner;

public class CountSetBitsFromNto1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            count += Integer.bitCount(n);
            n--;
        }
        System.out.println("Total Count is: " + count);
    }
}

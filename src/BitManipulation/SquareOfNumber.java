package BitManipulation;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        int num = n;
        int res = 0;
        int pos = 0;
        while(num > 0){
            if((num&1) == 1) {
                res += (n << pos);
            }
            num = num>>1;
            pos++;
        }
        System.out.println("Square of " + n + " is: " + res);
    }
}

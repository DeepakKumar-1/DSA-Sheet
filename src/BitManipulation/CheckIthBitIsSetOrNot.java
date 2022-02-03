package BitManipulation;

import java.util.Scanner;

public class CheckIthBitIsSetOrNot {
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Any Number: ");
       int n = sc.nextInt();
       System.out.print("Enter i: ");
       int i = sc.nextInt();
        if((n&(1<<i)) != 0) {
            System.out.println("This bit is Set");
        } else {
            System.out.println("This bit is Not Set");
        }
    }
}

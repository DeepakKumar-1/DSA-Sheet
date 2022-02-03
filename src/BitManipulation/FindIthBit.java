package BitManipulation;

public class FindIthBit {
    public static void main(String []args){
        int n = 78;
        int i = 3;
        System.out.println("Bit Representation of " + n + " is: " + Integer.toBinaryString(n));
        System.out.println( i + " Bit is: " + ((n & (1<<i))>>(i)));
    }
}

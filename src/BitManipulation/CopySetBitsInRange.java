package BitManipulation;

public class CopySetBitsInRange {
    public static void main(String []args){
        int x = 10;
        int y = 13;
        int l = 1;
        int r = 32;
        System.out.println(Integer.toBinaryString(x));
        for(int i=l; i<=r; i++){
            int mask = (1<<(i-1));
            if((y & mask)!=0) {
                x |= mask;
            }
        }
        System.out.println(x + " " + Integer.toBinaryString(x));
    }
}

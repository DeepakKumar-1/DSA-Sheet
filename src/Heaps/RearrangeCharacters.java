package Heaps;

import java.util.Scanner;

public class RearrangeCharacters {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            //  HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0;
            int []arr = new int['z' - 'a' + 1];
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                arr[ch - 'a']++;
                if(arr[ch - 'a'] > max){
                    max = arr[ch - 'a'];
                }

            }

            if(max <= str.length() - max + 1){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

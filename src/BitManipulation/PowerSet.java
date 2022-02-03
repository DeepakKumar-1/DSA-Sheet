package BitManipulation;
import java.util.ArrayList;
import java.util.Collections;

public class PowerSet {
    public static void main(String []args) {
        String str = "abcd";
        int k = str.length();
        ArrayList<String> list = new ArrayList<>();
        for (int n = 0; n < (1 << k); n++) {
            StringBuilder s = new StringBuilder();
            for(int i=0; i<k; i++){
                if((n&(1<<i)) != 0){
                    s.append(str.charAt(i));
                }
            }
            list.add(s.toString());
        }
        Collections.sort(list);
        System.out.println(list);
    }
}

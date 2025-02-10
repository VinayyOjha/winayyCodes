package ROUGH;
import java.util.*;
public class K_Pangram {
    public static void main(String[] args) {
        int k = 0;
        String str = "the quick brown fox jumps over the lazy dog";
        boolean ar = kPangram(str, k);
        System.out.println(ar);
    }

    static boolean kPangram(String str, int k){
        str = str.replaceAll(" ", "");
        //System.out.println(str);

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){ 
            char ch = str.charAt(i);
            set.add(ch);
        }
        
        System.out.println(" " + set);

        if (str.length() >= 26 && set.size() + k >= 26) {
            return true;
        }
        return false;
    }
}
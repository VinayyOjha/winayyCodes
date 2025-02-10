package ROUGH;
// import java.util.*;

public class dictionary {
    public static void main(String[] args) {
        String str = "zvvo";
        System.out.println(dups(str));
    }
    static String dups(String str){
        char[] c = new char[str.length()];
        c[0] = str.charAt(0);
        int j = 1;
        System.out.println(c);
        for(int i = 1; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(i-1)) {
                c[j] = c[i];
                j++;
            }
        }
        String s = new String(c);
        return s;
    }
}

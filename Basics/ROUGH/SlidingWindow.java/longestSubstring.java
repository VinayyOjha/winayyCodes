
import java.util.*;

public class longestSubstring {
    public static void main(String[] args){
        String s = "VinayyyOJha";
        System.out.println(longestSubstring(s));    
    }

    static int longestSubstring(String s){
        int i = 0, j = 0, length = 0;
        int arr[] = new int [128];
        Arrays.fill(arr, 0);
        char ch[] = s.toCharArray();
        System.out.println(arr[ch[j]]);
        
        while(j < ch.length) {
            if (arr[ch[j]] == 0){
                arr[ch[j]] = 1;
                j++;
                length = Math.max(length, j - i + 1);
            }
            else {
                arr[ch[j]] = 0;
                j++; i++;
            }
        }

        return length;
    }
}


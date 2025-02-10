package ROUGH;
import java.util.*;

public class roughHashMap {
    
    public static void main(String[] args){
        HashMap<Character, Integer> map = new HashMap<>();
        String temp = "kjakjbbabbkabakjdkbbabwqytvdfxzc";
    
        for(int i=0;i<temp.length();++i){
        char ch = temp.charAt(i);
        map.put(ch,1);
        }   
    }
}

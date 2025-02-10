import java.util.*;
import java.util.Map.Entry;
public class B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            String a = sc.next();
            int sum = 0;
            HashMap<Character, Integer> map = new HashMap<>();

            for(int i = 0; i < N; i++){ 
                Character c = a.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for(Entry<Character,Integer> entry : map.entrySet()){
                if (entry.getValue() > 1) sum = sum + entry.getValue() + 1;
                else if(entry.getValue() == 1) sum += 2;
            }
            System.out.println(sum);
        }
    }
}
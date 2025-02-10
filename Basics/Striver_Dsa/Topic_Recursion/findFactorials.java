package Striver_Dsa.Topic_Recursion;
import java.util.*;

public class findFactorials {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long n = sc.nextInt(); 
    //    ArrayList<Long> list2 = new ArrayList<>();
       
       factorialNumbers(n);
    //    for (Long long1 : list2) {
    //         System.out.println(long1);
    //    }
       sc.close();
    }
    public static void factorialNumbers(long n){
        ArrayList<Long> ans = new ArrayList<>();
        ans.add((long)1);
        helper(ans, n, 1);
        for (Long listt : ans) {
            System.out.println(listt);
        }
    }
    
    static void helper(ArrayList<Long> ans, long n, long num){
        long fact = ans.get((ans.size()-1)) * (num + 1);

        if (fact > n) return; // BASE CONDITION

        ans.add(fact);
        helper(ans, fact, (num + 1)); // FUNC CALL
    }
}

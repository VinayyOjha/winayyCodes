package ROUGH;
import java.util.*;

public class factoriaUsingRecursion {
    public static void main(String[] args) {
        long n = 6;
        ArrayList<Long> list = new ArrayList<>();
        list = factorialNumbers(n);
        System.out.println(list);
    }

    public static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        long i = 2;
        long fact = 1;
        helper(al, i, fact, n);
        return al;
    }

    static void helper(ArrayList<Long> al, long i, long fact, long n){
        if(fact > n) return;
        al.add(fact);

        fact = fact * i;
        helper(al, i+1, fact, n);
    }
}

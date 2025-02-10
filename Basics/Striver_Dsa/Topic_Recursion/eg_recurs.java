// PRINT A NAME N TIMES

package Striver_Dsa.Topic_Recursion;

public class eg_recurs {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(7));
    }

    static long sumOfSeries(long n){
        long sum = 0;
        return helper(n, sum);
    }

    static long helper(long n, long a){
        if( n == 0) return 0;
        a = n*n*n + helper(n-1, a);
        return a;
    }
}

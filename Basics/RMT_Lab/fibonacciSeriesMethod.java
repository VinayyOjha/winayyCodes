package RMT_Lab;
import java.util.*;

public class fibonacciSeriesMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double  lowerBound = 0;
        int upperBound = 1;
        int k = 1, n  = 3;
        fibo(list, n);
        int q = 0;
        System.out.println(list.get(n-k));
        System.out.println(list.get(n-k+1));

        System.out.println(list.get(n-2));
        System.out.println(list.get(n-3));


        for(int i = k; i <= n; i++){
            q = list.get(n-k) / list.get(n-k+1);
            System.out.println(q);
        }
    }

    static void fibo(ArrayList<Integer> list, int n){
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
    }
}

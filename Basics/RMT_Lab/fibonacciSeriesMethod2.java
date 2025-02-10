package RMT_Lab;
import java.util.*;

public class fibonacciSeriesMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lowerBound = 0.0;
        lowerBound = sc.nextDouble();
        double upperBound = 1.0;
        int n = 3, k = 1;
        cal(lowerBound, upperBound, n, k);
    }

    static void cal(double l, double r, int n, int k){
        ArrayList<Double> list = new ArrayList<>();
        // list.add(1.0);
        // list.add(1.0);
        // list.add(2.0);
        // list.add(3.0);
        // list.add(5.0);
        // list.add(8.0);
        // list.add(13.0);
        // list.add(21.0);

        double a = list.get(n-k)/list.get(n-k+1);
        System.out.println("The division is " + a);

        double f=0.0; double x2=0.0, x1=0.0, valX1=0.0, valX2=0.0;
        while(k != n+1){
            f = list.get(n-k) / list.get(n-k+1);
            x2 = l + f*(r-l);
            System.out.println("Val of X2 " + x2);
            x1 = l + r - x2;
            System.out.println("Val of X1 " + x1);

            valX1 = x1*x1;
            valX2 = x2*x2;
            if(valX1 <= valX2){
                r = x2;
            }

            else {
                l = x1;
            }
            k++;
        }
        System.out.println("Average: " + (x1+x2)/2);
    }
}

package RMT_Lab;
import java.util.*;

public class gsm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N;
        int K = 1;
        double L, R, X1= 0.0, X2 = 0.0, FX1 = 0.0, FX2=0.0;

        N = sc.nextDouble();
        L = sc.nextDouble();
        R = sc.nextDouble();

        while(R - L > N){
            X2 = L + (0.618) * (R - L);
            X1 = L + R - X2;
            FX1=fx(X1);
            FX2=fx(X2);

        

            // System.out.println(X1);
            // System.out.println(X2);
            // System.out.println(FX1);
            // System.out.println(FX2);
            if(FX1 <= FX2){
                R = X2;
            }

            else {
                L = X1;
            }
            K++;
        }
    System.out.println((FX2 + FX1)/2);
    }

    static double fx(double x){
        double ans = 4*x*x*x + x*x - 7*x + 14;
        return ans;
    }
}

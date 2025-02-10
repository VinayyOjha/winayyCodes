import java.util.*;

public class reversing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];

        for(int i = 0; i < N; i++){ 
            A[i] = sc.nextLong();
        }
        int i = 0, j = N - 1;

        while (i <= j){
            long temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++; j--;
        }
        for (long l : A) {
            System.out.print(l + " ");
        }
    }
}

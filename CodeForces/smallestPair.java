import java.util.*;

public class smallestPair {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-->0){
                int N = sc.nextInt();
                int A[] = new int[N];

                for(int i = 0; i < N; i++){
                    A[i] = sc.nextInt();
                }

                int minSum = Integer.MAX_VALUE;
                for(int i = 0; i < N-1 ; i++){ 
                    minSum = Math.min(minSum, A[i] + A[i+1] + 1);
                }
                System.out.print(minSum);
                System.out.println();
            }
        }
    }
}

import java.util.*;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];

        for(int i = 0; i < N; i++){ 
            A[i] = sc.nextLong();
        }

        long target = sc.nextLong();

        for(int i = 0; i < N; i++){ 
            long a = A[i];
            if (A[i] == target){
                System.out.println(i); break;
            }
            if ((i == N - 1) && (a != target)) System.out.println(-1);
        }
    }
}

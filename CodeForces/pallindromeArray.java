import java.util.*;

public class pallindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];

        for (int i = 0; i < N; i++){
            A[i] = sc.nextLong();
        }
        int i = 0, j = N - 1;

        while (i <= j){
            if (A[i] != A[j]) {
                System.out.print("NO");
                return;
            }
            i++; j--;
        }
        System.out.print("YES");
    }
}

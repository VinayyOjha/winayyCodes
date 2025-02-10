import java.util.*;
public class SortingCF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++){
            // int minEl = A[i];
            for (int j = i + 1; j < N; j++){
                if (A[j] < A[i]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                } 
            }
        }

        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}

import java.util.Scanner;

public class lowestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int lowest = Integer.MAX_VALUE; int index = 0;

        for(int i = 0; i < N; i++){ 
            A[i] = sc.nextInt();
            if (A[i] < lowest) {
                lowest = A[i]; index = i;
            }
        }

        System.out.println(lowest + " " + (index + 1));
    }
}

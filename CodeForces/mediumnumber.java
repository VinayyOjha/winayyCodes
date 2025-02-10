import java.util.*;
public class mediumnumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] A = new int[3];
            for(int i = 0; i < 3; i++){ 
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            System.out.println(A[1]);
        }
    }
}
import java.io.*;
import java.util.*;

public class Replacement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // Read the size of array
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (A[i] < 0) A[i] = 2;
            else if (A[i] == 0) A[i] = 0;
            else A[i] = 1;
        }

        for(int i = 0; i < N; i++){ 
             System.out.print(A[i] + " ");
        }
    }
}

// import java.util.*;

// public class Replacement {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int N = s.nextInt();
//         int A[] = new int[N];

//         for(int i = 0; i < N; i++){ 
//             int a = s.nextInt();
//             if (a < 0) a = 2;
//             else if (a == 0) a = 0;
//             else a = 1;
//             A[i] = a;
//         }
        
//         for(int i = 0; i < N; i++){ 
//             System.out.print(A[i] + " ");
//         }
//     }
// }

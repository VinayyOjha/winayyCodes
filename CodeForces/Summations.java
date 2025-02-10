import java.io.*;
import java.util.*;

public class Summations {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += sc.nextLong(); 
        }

        System.out.println(Math.abs(sum));
    }
}

// import java.io.*;
// import java.util.*;

// public class Summations {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());  // Read the size of array
//         long[] A = new long[N];
//         long sum = 0;

//         StringTokenizer st = new StringTokenizer(br.readLine());
//         for (int i = 0; i < N; i++) {
//             A[i] = Long.parseLong(st.nextToken());
//             sum += A[i];
//         }

//         System.out.println(Math.abs(sum));
//     }
// }
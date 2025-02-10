import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Read the number of test cases

        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // The minimum possible value of (c-a) + (b-c) is simply (b - a)
            System.out.println(b - a);
        }
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}

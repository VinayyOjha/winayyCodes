package Striver_Dsa.BS;

public class squareRoot {
    public static void main(String[] args) {
        int n = 5;

        int low = 1;
        int high = n;
        int ans = 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid * mid == n) {
                System.out.println(mid);
                return;
            }

            if (mid * mid < n) {
                ans = mid;  // Store potential answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);  // Return the floor value of sqrt(n)
    }
}

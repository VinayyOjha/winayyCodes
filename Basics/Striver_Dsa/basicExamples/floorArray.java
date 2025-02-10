package Striver_Dsa.basicExamples;
import java.util.*;

public class floorArray {
    public static void main(String[] args) {
        long[] arr = {2,3,5,9,9,9,9,14,19};
        int n = arr.length;
        long x = 9;
        System.out.println("The floor is: " + findFloor(arr, n, x));
        System.out.println("The ceiling is: " + findCeil(arr, n, x));
    }
//  IMP : FLOOR: The largest number less than or equal to target.
    static int findFloor(long arr[], int n, long x) {
        
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if (arr[mid]  == x){
                ans = mid;
                high = mid - 1;
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

//  IMP : CEIL: The smallest number greater than or equal to target.
    static int findCeil(long arr[], int n, long x) {
        
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid]  == x){
                ans = mid;
                low = mid + 1;
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

package Striver_Dsa.Arrays;
import java.util.*;

public class longestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4, 5};
        System.out.print(lSN(arr, arr.length));
    }

    static int lSN(int[] arr, int n){
        int maxLength = 1;
        int length = 1;
        Arrays.sort(arr);

        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i] == arr[i-1] + 1){
                length++;
            }
            else{
                length = 1;
            }

            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }
}

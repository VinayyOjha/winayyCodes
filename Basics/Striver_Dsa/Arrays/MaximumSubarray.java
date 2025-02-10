package Striver_Dsa.Arrays;

public class MaximumSubarray {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("\nMaximum sum is " + maxSubArray(arr));
    }

    static int maxSubArray(int[] arr){
        int sum = 0;
        int maximumSum = Integer.MIN_VALUE;
        int arrStart = -1;
        int arrEnd = -1;
        int start = 0;

        for(int i = 0; i < arr.length; i++){
            if (sum == 0) {start = i;}
            sum += arr[i];
            // System.out.println(sum);

            if(sum > maximumSum) {
                arrStart = start;
                arrEnd = i;
                maximumSum = sum;
            }
            if(sum < 0) sum = 0;
        }
        System.out.print("The starting and ending indices of the subarray with maximum sum is:"+ arrStart + " " + arrEnd + " and length is " + (arrEnd - arrStart + 1));
        return maximumSum;
    }
}
/*
    class Solution {
    public static long cntGood(String S) {
        // code here
        int subArrayCount = 0;
        int[] digits = new int[S.length()];
        
        for(int i = 0; i < S.length(); i++){
            digits[i] = S.charAt(i) - '0';
        }
        
        for(int i = 0; i < digits.length; i++){
            if(digits[i] == 0) continue;
            for(int j = i; j < digits.length; j++){
                
                if((digits[i]*10 + digits[j]) % 2 ==1) subArrayCount++;
            }
        }
        return subArrayCount;
    }
}
 */
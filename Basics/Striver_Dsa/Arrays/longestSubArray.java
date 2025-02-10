package Striver_Dsa.Arrays;

public class longestSubArray {
    public static void main(String[] args){
        int[] A = {2, 3, 5, 1, 9};
        int K = 5;
        int length = 0;
    
        for(int i = 0; i < A.length; i++){
            int sum = 0;
            for(int j = i; j < A.length; j++){
                sum += A[j];

                if(sum == K) 
                    length = Math.max(length, j-i+1);
            }
        }
        System.out.println(length);
    }
}

package ROUGH;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {-1, -100, 3, 99,88, 79};
        int k = 2;
        rotate(arr, k);
    }
    static void rotate(int[] nums, int k){
        int size = nums.length;
        k = k % size;
        int[] temp = new int[nums.length];
        if (size != 1) {
            int a = 0;
            for(int i = 0; i < k; i++){
                temp[i] = nums[size-k+i];
                a++;
            }
        
            for(int j = 0; j < (size - k); j++){
                temp[a] = nums[j];
                a++;
            }
            int c = 0;
            for (int i : temp) {
                nums[c] = i;
                c++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
/* 
    0 1 2 3` 4  5  6  --> size - k = 7 - 3 = 4 (<=3)
    1 2 3 4  5  6  7      
    5 6 7 1  2  3  4

    0    1    2`    3   --> size - k = 4 - 2 = 2 (<=1)
   -1  -100   3    99 
    3    99   1  -100
*/ 
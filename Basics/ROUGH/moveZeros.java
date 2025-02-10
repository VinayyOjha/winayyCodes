package ROUGH;
import java.util.*;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 33, 2};
        helper(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void helper(int[] nums){
        int n = nums.length;
        int j = 0;
        while (nums[j] != 0) {
            j++;
        }
        System.out.println(j);
        
        for(int i = j+1; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

/*
    
 */

         // ArrayList<Integer> list = new ArrayList<>();
        // int i = 0, j = 0;
        // int n = arr1.length;
        // int m = arr2.length;
        
        // while(i < n && j < m){
        //     if(arr1[i] <= arr2[j]){
        //         if(list.get(list.size()-1) != arr1[i] || list.size() == 0){
        //             list.add(arr1[i]);
        //         }
        //         i++;
        //     }

        //     else{
        //         if(list.get(list.size()-1) != arr2[j] || list.size() == 0){
        //             list.add(arr2[j]);
        //         }
        //         j++;
        //     }
        // }

        // while(i < n){
        //     if(list.get(list.size()-1) != arr1[i]){
        //         list.add(arr1[i]);
        //     }
        //     i++;
        // }

        // while(j < m){
        //     if(list.get(list.size()-1) != arr2[j]){
        //         list.add(arr2[j]);
        //     }
        //     j++;
        // }

        // return list;
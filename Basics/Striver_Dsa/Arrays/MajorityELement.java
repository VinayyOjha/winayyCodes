package Striver_Dsa.Arrays;
import java.util.*;

public class MajorityELement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majortiyElement(nums));
    }

    static int majortiyElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = nums.length/2;
        int majorityElementCount = nums[0];
        for(int num : nums){
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if(count > maxi){
                majorityElementCount = num;
                return majorityElementCount;
            }
        }
        return -1;
    }
}

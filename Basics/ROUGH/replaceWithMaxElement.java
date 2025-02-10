package ROUGH;
import java.util.*;

public class replaceWithMaxElement {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElememts(arr)));
    }
    static int[] replaceElememts(int[] nums){
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length-1; i++){
            int max = nums[i];
            for(int j = i+1; j < nums.length-1; j++){
                if (nums[j] < max) {
                    max = nums[j+1];
                }
            }
            nums[i] = max;
        }
        return nums;
    }
}

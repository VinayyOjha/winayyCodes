package ROUGH;
import java.util.ArrayList;
import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        int[] arr = {  70, 80, 90, 100 ,10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[][] queries = { { 2, 5 }, { 1, 4 }, { 4, 9 } };
        
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            prefix[i] = arr[i]+prefix[i-1];
        }

        System.out.println("This is the prefix_sum_Array:" + Arrays.toString(prefix));

        ArrayList<Integer> list = new ArrayList<>();

        for(int[] x : queries){
            int sum = 0;
            // start = x[0]
            // end = x[1]

            if(x[0] == 0){
                sum = prefix[x[1]];
            }
            else{
                sum = prefix[x[1]] - prefix[x[0]-1];
            }

            list.add(sum);
        }
        System.out.println(list);
    }
}

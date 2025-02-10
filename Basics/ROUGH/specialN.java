package ROUGH;
import java.util.*;

class specialN{
    public static void main(String[] args) {
        int l = 2; 
        int r = 26050;
        
        // ArrayList<Integer> list = new ArrayList<>();
        
        int sNumber = 0;
        
        for(int i = l; i <= r; i++){
            int count = 1;
            for(int j = i-1; j > 1; j--){
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sNumber++;
            }
        }
        System.out.println(r-l-sNumber+1);
    }

    // static int helper(ArrayList al, int low, int high, int count, int sepcialNumbers){
    //     helper(al, low+1, high, count, sepcialNumbers);
    //     return sepcialNumbers;
    // }
}
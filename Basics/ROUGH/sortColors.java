package ROUGH;
import java.util.*;

class sortColors{
    public static void main(String[] args){
        int[] arr = {2,1,0, 0,1,2,0,2,1,2};
        sortTheColors(arr, arr.length);
        System.out.print(Arrays.toString(arr));
    }

    static void sortTheColors(int[] arr, int n){
        int countZero = 0, countOnes = 0, countTwos = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) countZero++;
            if(arr[i] == 1) countOnes++;
            else countTwos++;
        }
        for(int i = 0; i < countZero; i++) arr[i] = 0;
        for(int i = countZero; i < countZero + countOnes; i++) arr[i] = 1;
        for(int i = countZero + countOnes; i < n; i++) arr[i] = 2;
    }
}
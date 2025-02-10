package Striver_Dsa.Arrays;
import java.util.*;

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(Arrays.toString(nxtPermutations(arr, arr.length)));
    }

    static int[] nxtPermutations(int[] arr, int n){
        int max = arr[n-1];
        int index = -1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr, 0, n-1);
            return arr;
        }

        for(int i = n-1; i >= 0; i--){
            if(arr[i] > arr[index]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        
        
        reverse(arr, index+1, n-1);
        return arr;
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}

/*
    2   1   5   4   3   0
    2   3   5   4   1   0
    2   3   0   1   4   5
 */
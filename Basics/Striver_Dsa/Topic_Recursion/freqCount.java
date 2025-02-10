package Striver_Dsa.Topic_Recursion;

import java.util.Arrays;

public class freqCount {
    public static void main(String[] args) {
                    int arr[] = {2, 34, 55, 34};
                    Selection(arr);
                    System.out.println(Arrays.toString(arr));
                }
                static void Selection(int arr[]){
                    for(int i = 0; i < arr.length; i++){ 
                        int last = arr.length-i-1;
                        int maxIndex = getMaxIndex(arr, 0, last);
                        swapp(arr, maxIndex, last);
                    }
                }
            
                static void swapp(int arr[], int max, int last){
                    int temp = arr[last];
                    arr[last] = arr[max];
                    arr[max] = temp;
                }
            
                static int getMaxIndex(int arr[], int start, int end){
                    int max = start;
                    for(int j = 0; j <= end; j++){ 
                        if(arr[max] < arr[j]){
                            max = j;
                        }
                    }
                    return max;
                }
            
}

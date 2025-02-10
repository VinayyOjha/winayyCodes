package Topic_SORTING;
import java.util.*;

public class SelctionSort {
        public static void main(String[] args) {
            int arr[] = {9,8,7,34,34,454,4,4,543};
            int arr2[] = {443, 2345, 9,8,7,6,65,};
            // Selection(arr);
            // System.out.println(Arrays.toString(arr));
            // System.out.println(Arrays.toString(arr2));
            selectionSort(arr2);
            System.out.println(Arrays.toString(arr2));
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

        static void selectionSort(int[] arr){
            for(int i = 0; i < arr.length-2; i++){ 
                int min = i;
                for(int j = i; j < arr.length-1; j++){
                    if(arr[j] < arr[min]) min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }


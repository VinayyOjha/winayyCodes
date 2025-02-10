package ArrayExamples;

import java.util.Arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {12, 1, 32, 34, 500, 2, -4999, 57}; // This works for both even/odd numbers of element in the array.

        int maxItem = max(arr);
        int maxItemInRange = maxRange(arr, 0, 3);
        
        System.out.println("The maximun number is: " + maxItem);
        System.out.println("The maximun number in Range is: " + maxItemInRange);
        reverseArray(arr);
        reverseArray2(arr);
    }
    // MAximun Item in the Array
    static int max(int[] arr){
        int item = 0;
        for(int i = 0; i < (arr.length); i++){ 
            if (item < arr[i]){
                item = arr[i];
            }
        }
        return item;
    }

    // Maxium item in a given range
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for(int i = start; i <= end; i++){ 
            if (maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // FRIST WAY: Reversing an Array
    static void reverseArray(int[] arr){
        int[] temp = new int[arr.length];
        int j =0;
        for(int i = arr.length-1; i >= 0; i--){ 
            temp[j] = arr[i];
            j++;
        }
        System.out.println("The reversed array is\n " + Arrays.toString(temp));
    }

    // SECOND WAY:
    static void reverseArray2(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println("Printing the reversed array using the second method:\n" + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];

        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

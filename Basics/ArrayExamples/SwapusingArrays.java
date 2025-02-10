package ArrayExamples;

import java.util.Arrays;

public class SwapusingArrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 10};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}

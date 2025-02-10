package Topic_SORTING;
import java.util.Arrays;

public class BunbbleSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for(int i = 0; i <= arr.length-2; i++){

            for(int j = 0; j < arr.length-i-1; j++){ 
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

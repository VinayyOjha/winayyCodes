import java.util.Arrays;
import java.util.Collections;

public class Topic_ArraysClass {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,10};

        // METHOD 1 : arr.length

        // METHOD 2 : binarySearch(arr, key)
        System.out.println(Arrays.binarySearch(arr,7)); // 7 =  4 | 0 = -1

        // METHOD 3 : copyOfRange(arr, startIndex[I], endIndex[E])
        int[] temp = Arrays.copyOfRange(arr, 0, 3);
        System.out.println(Arrays.toString(temp)); // [1, 3, 5]

        // METHOD 4 : sort(arr) | sort(arr, startIndex[I], endIndex[E]) ASCENDING ORDER
        int[] temp2 = {3,1,2,8,7,6,5};
        Arrays.sort(temp2,2,5);
        System.out.println(Arrays.toString(temp2)); // [3, 1, 2, 7, 8, 6, 5]

        // METHOD 4.1 : sort(arr,startIndex[I],endIndex[E],Collection.reverseOrder())
        Integer temp3[] = {5,4,3,2,9,8,7,6};
        Arrays.sort(temp3,2,temp3.length,Collections.reverseOrder());
        System.out.println(Arrays.toString(temp3)); // [5, 4, 9, 8, 7, 6, 3, 2]
       
        // METHOD 5 : equals(obj1, obj2)
        System.out.println(Arrays.equals(arr, temp)); // false
    }
}

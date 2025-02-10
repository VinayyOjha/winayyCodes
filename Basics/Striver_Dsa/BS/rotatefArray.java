package Striver_Dsa.BS;

public class rotatefArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        // 39 6 11 14 18 36 37 38
        calRotation(arr);
    }

    static void calRotation(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int mini = Integer.MAX_VALUE;
        int minIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] < mini) {
                minIndex = mid;
                mini = arr[mid];
            } 

            if (arr[mid] < arr[high]) high = mid - 1;
            else low = mid + 1;
        }

        System.out.println(minIndex);
    }
}

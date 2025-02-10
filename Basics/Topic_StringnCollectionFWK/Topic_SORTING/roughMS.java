package Topic_SORTING;
import java.util.*;

public class roughMS {
    public static void main(String[] args) {
        int[] arr = {2,1,0,2,0,0,0,1,1,2,1,2};
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high){
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++; mid++;
            }

            else if (arr[mid] == 1){
                mid++;
            }
            
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}

// static void mergeSort(int[] arr, int low, int high) {
//     if (low >= high) return;

//     int mid = (low + high) / 2;
//     mergeSort(arr, low, mid);
//     mergeSort(arr, mid + 1, high);
//     merge(arr, low, mid, high);
// }

// static void merge(int[] arr, int low, int mid, int high){
//     ArrayList<Integer> list = new ArrayList<>();
    
//     int left = low;
//     int right = mid + 1;

//     while (left <= mid && right <= high){
//         if (arr[left] <= arr[right]) {
//             list.add(arr[left]);
//             left++;
//         }
//         else {
//             list.add(arr[right]);
//             right++;
//         }
//     }

//     while (left <= mid) {
//         list.add(arr[left]);
//         left++;
//     }

//     while (right <= high) {
//         list.add(arr[right]);
//         right++;
//     }

//     for (int i = low; i <= high; i++){
//         arr[i] = list.get(i - low);
//     }
// }
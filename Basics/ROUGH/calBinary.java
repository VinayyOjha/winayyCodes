// package Basics.ROUGH;
import java.util.*;

public class calBinary {
    public static void main(String[] args) {
        int[][] arr = {
            {01, 02, 03, 04},
            {06, 86, 07, 9},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 6;
        int[] ans = binarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int coloumn = arr.length - 1;

        while (row < arr.length && coloumn >= 0){
            if (arr[row][coloumn] == target) return new int[]{row + 1, coloumn + 1};
            else if (arr[row][coloumn] < target) row++;
            else coloumn--;
        }

        return new int[] {-1, -1};
    }
}

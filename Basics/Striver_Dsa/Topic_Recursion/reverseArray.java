package Striver_Dsa.Topic_Recursion;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println(" ");
        ReverseArray(0, arr, n);
        for (int i : arr) {
            System.out.print(i);
        }
    }
    static void ReverseArray(int i, int[] array, int n){
        if(i >= n/2) return;

        int temp = array[i];
        array[i] = array[n-i-1];
        array[n-i-1] = temp;

        ReverseArray(i+1, array, n);
    }
}

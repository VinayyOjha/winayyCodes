package Striver_Dsa.Arrays;
import java.util.*;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0 ,6};
        System.out.println(leaders(arr, arr.length));
    }

    static ArrayList<Integer> leaders(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n-1];
        int count = 1;
        list.add(arr[n-1]);

        for(int i = n-2; i >= 0; i--){
            if(arr[i] > max){
                list.add(arr[i]);
                max = arr[i];
                count++;
            }

            if(arr[i] == max){
                continue;
            }
            else{
                count = 1;
            }

        }
        
        Collections.reverse(list);
        return list;
    }
}

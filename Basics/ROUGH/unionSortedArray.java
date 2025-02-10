package ROUGH;
import java.util.*;

public class unionSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2};
        int[] arr2 = {2, 3, 4, 40};
        
        System.out.println(helper(arr1, arr2));
    }
    public static ArrayList<Integer> helper(int[] arr1, int[] arr2){


        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    System.out.print(arr1[i] + " ");
                }
                i++;
            }
            
            else{
                if(list.size() == 0 || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                    System.out.print(arr2[j] + " ");
                }
                j++;
            }
        }

        while(i < n){
            if(list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        while(j < m){
            if(list.get(list.size()-1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        return list;


        // int n1 = arr1.length;
        // int n2 = arr2.length;
        // ArrayList<Integer> list = new ArrayList<>();
        
        // while(i < n1 && j < n2){
        //     if(arr1[i] <= arr2[j]){
                
        //         if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
        //             list.add(arr1[i]);
        //         }
        //         i++;
        //     }
            
        //     else{
        //         if(list.size() == 0 || list.get(list.size()-1) != arr2[j]){
        //             list.add(arr2[j]);
        //         }
        //         j++;
        //     }
        // }
        
        // while(i < n1){
        //     if(list.get(list.size()-1) != arr1[i]){
        //         list.add(arr1[i]);
        //     }
        //     i++;
        // }
        
        // while(j < n2){
        //     if(list.get(list.size()-1) != arr2[j]){
        //         list.add(arr2[j]);
        //     }
        //     j++;
        // }
        
        // return list;
    }
}

import java.util.*;

public class countDistinct {

    public static void main(String args[]){
        System.out.println(countDistinct(new int[]{1, 2, 1, 3, 4, 2, 3}, 4));
        int arr[] = {1, 2, 1, 3, 4, 2, 3}; int a = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(a < 4){
            map.put(arr[a], map.getOrDefault(arr[a], 0) + 1);
            a++;
        }
        System.out.println(map);
    }

    static ArrayList<Integer> countDistinct(int arr[], int k){
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while(j < arr.length){
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
        
            if(j - i + 1 == k){
                res.add(map.size());
                System.out.println("Before: " + map);
                map.put(arr[i], map.get(arr[i]) - 1);
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]);
                }
                System.out.println(map);
                i++;
            }
            j++;
        }
        return res;
    }
}

import java.util.HashSet;
import java.util.*;

public class Topic_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        //  ->  ADDING : add(element) | addAll()
        
        ArrayList<Integer> list = new ArrayList<>();
        

        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(40);
        
        set.addAll(list);
        System.out.println("SET : "+set);
        
        // ACCESSING 
        for(int x : set){
            System.out.println(x);
        }
        
        // REMOVING  ->  remove(element) | removeAll(collection)
        set.remove(50);
        System.out.println("NEW SET : "+set);
        
        // FOR EACH
        for(int item : set){
            System.out.print(item+" ");
        }
        
        // SEARCHING  ->  contains() | containsAll()
        System.out.println("\nSEARCHING : "+set.contains(100));
        
        // ADDITIONAL  ->  size() | isEmpty() | equals()
        
        // New stuff
        int arr[] = {1,2,3,1};
        HashSet<Integer> setArray = new HashSet<>();
        for (Integer integer : arr) {
            setArray.add(integer);
        }
        for(int item : setArray){
            System.out.print(item+" ");
        }
        
    }
}

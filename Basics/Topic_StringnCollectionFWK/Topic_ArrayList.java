//   NOTE :
/**
 ->  ArrayList is faster than Vector because it is non-synchronised(multiple threads can access the code).

 ->  ArrayList implements 'List Interface' hence ArrayList accepts only refrences to objects and not primitive data type.

 ->  We use wrapper class inorder to use ArrayList with primitive data
 types as it creates an object of the data.

*/

import java.util.*;
// import java.util.Arrays;

public class Topic_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // ADDING  ->  add(object) | add(index,object) | addAll()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(200);
        list.add(300);
        list.add(2,100); 
        
        System.out.println("\nLIST : "+list);

        // EXTRACTING  ->  get(index) | forEach()
        System.out.print("\nEXTRACTING : ");
        for(int item : list){
            System.out.print(item+" ");
        }
        
        // REMOVING  ->  remove(index) | removeAll(collection)
        System.out.print("\nREMOVING : ");
        ArrayList<Integer> rm = new ArrayList<>();
        rm.add(100);
        rm.add(200);
        rm.add(300);
        list.removeAll(rm);
        list.remove(0);
        System.out.print(list);
        
        // UPDATE  ->  set(index,NewValue)
        list.set(0, 1000);
        System.out.println("\nUPDATE : "+list);

        // SEARCHING  ->  .indexOf() | contains(element) | containsAll(collection)
        ArrayList<Integer> sr = new ArrayList<>();
        
        sr.add(30);
        sr.add(40);
        sr.add(50);
        sr.add(1000);
         
        System.out.println("SEARCHING : "+list.containsAll(sr));

        // SIZE  ->  size() | isEmpty()
    }
}

//  NOTE :
/* 
    ->  ArrayList is faster than Vector because it is non-synchronised(multiple threads can acces the code)

    ->  ArrayList implements 'List interface' hence ArrayList accepts only refrences to objects and not primitive data type.

    ->  We use wrapper class inorder to use ArrayList with primitive data types as it creates an object of the data.

    ->  Array Objects are stored in Heap memory. Unlike C/Cpp, heap objects are not continous. Depends on JVM.
 */
package ArrayExamples;
import java.util.*;

public class Topic_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> chara = new ArrayList<>();

        //ADDING  ->  add(object) | add(index, object) | addAll()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(45);
        list.add(53);
        list.add(22);
        list.add(100);
        list.add(2, 200);
        list.add(scanner.nextInt());
        System.out.println("\nList: " + list);

        chara.add('f');
        System.out.println("\n Character ArayList:\n"  + chara);

        // EXTRCTING  ->  get(index) | forEach()
        System.out.println("\nExtracting: ");
        for (int item : list) {
            System.out.println(item+ " ");
        }
        // NOTE : int dex = list.get(3);
        System.out.println("\n" + list.get(3));

        // REMOVING  ->  remove(index) | removeAll(collection)  
        System.out.println("\nRemoving: ");
        ArrayList<Integer> remv = new ArrayList<>();
        remv.add(100);
        remv.add(22);
        remv.add(30);
        list.removeAll(remv);
        list.remove(0);
        System.out.println(list);

        // UPDATE  ->  set(index, NewValue)
        list.set(0, 100);
        System.out.println("\nUpdate:\n" + list);

        // SEARCHING  ->  .indexOf() | contains(element) | containsAll(collection)
        ArrayList<Integer> srchng = new ArrayList<>();

        srchng.add(45);
        srchng.add(53);
        System.out.println("\nPrinting srchngList" );
        for (int integer : srchng) {
            System.out.println(integer+ " ");
        }
        System.out.println("\nSearching:" + list.containsAll(srchng));
        
        System.out.println("\n " + srchng.indexOf(53));
        System.out.println("\n " + list.indexOf(80));
        System.out.println("\n " + list.indexOf(200));

        // NOTE : MULTIDIMENSIONAL ARRAY:
         ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(); // Observe the definition of ArrayList for a 3D-ArrayList.
         
         for(int i = 0; i < 3; i++){ 
             list2.add(new ArrayList<>()); // DMA. IMP : Refer to Lec#12 (1:32:00) of DSA: Kunal K.
         }
         
         for(int i = 0; i < 3; i++){ 
            for(int j = 0; j < 3; j++){ 
                list2.get(i).add(scanner.nextInt());
            }
         }

        for (ArrayList<Integer> iterable_element : list2) {
            System.out.println(iterable_element);
        }
        scanner.close();
    }  
}

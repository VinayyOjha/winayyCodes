import java.util.Arrays;
import java.util.TreeSet;
import java.util.*;

class Topic_HashSetSorted{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        //  ->  ADDING : add() | addAll()
        set.add(10);
        set.add(40);
        set.add(0);
        set.add(30);

        // NOTE : function to give second last digit of a TreeSet
        System.out.println("The second largest number in the treeset is: " + set.lower(set.last()));

        
        // IMP : CONVERTING A TREESET INTO AN ARRAY(we make use of the data type class and object)
        Integer[] intArray = new Integer[set.size()];
        intArray = set.toArray(intArray); 
        System.out.println(Arrays.toString(intArray));
        
        // Convert the ArrayList to a TreeSet
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>(list);


        //Character HashSet
        TreeSet<Character> set2 = new TreeSet<>(); 
        String str1 = "v i n a y y y";

        // Adding charcaters in a character type TreeSet
        for(int i = 0; i < str1.length(); i++){ 
            set2.add(str1.charAt(i));
        }


        // String HashSet
        TreeSet<String> set3 = new TreeSet<>(); 
        String str = "v i n a y y y";
        set3.add(str);
        

        System.out.println("SORTED SET : "+set); // [0,10,30,40]

        System.out.println("SORTED SET OF STRING : " + set2); // [a, i, n, v, y]

        System.out.println("SORTED SET OF STRING : " + set2.getFirst()); // [a, i, n, v, y]

        System.out.println("SORTED SET OF STRING : " + set3); // [a, i, n, v, y] 

        
    }
}
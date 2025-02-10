import java.util.*;

public class Topic_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();

        // ADDING  ->  addFirst(element) | addLast(element) | addAll()
        list.addLast(10);
        list.addLast(20);
        list.addFirst(100);
        System.out.println("\nLIST : "+list);
        
        // DISPLAY  ->  peekFirst() | peekLast()
        System.out.println("PEEK : "+list.peekFirst()+" "+list.peekLast());

        // SEARCHING  ->  contains() | containsAll(collection)
        ArrayList<Integer> sr = new ArrayList<>();
        sr.add(10);
        sr.add(100);
        System.out.println("SEARCHING : "+list.containsAll(sr));

        // ITERATION
        System.out.print("ITERATION : ");
        for(int item : list){
            System.out.print(item+" ");
        }
        
        // REMOVING  ->  pollFirst() | pollLast()
        System.out.println("\nDELETING : "+list.pollFirst()+" "+list.pollLast());

        // SIZE  ->  size() | isEmpty()
        System.out.println("EMPTY ? "+list.isEmpty());

        // CONVERT  ->  .toArray() | toString()
    }
}

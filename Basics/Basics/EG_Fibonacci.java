package Basics;
import java.util.*;

public class EG_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num = sc.nextInt();
        
        
        int a = 0, b = 1, c;
        list.add(b);
        // System.out.print(" " + a);
        // System.out.print(" " + b);

        for(int i = 1; i < num; i++){
            // int temp = b;
            c = a + b;
            // System.out.print(" " + c);
            list.add(c);
            a = b;
            b = c;
        }
        sc.close();
        System.out.println(list);
    }
}



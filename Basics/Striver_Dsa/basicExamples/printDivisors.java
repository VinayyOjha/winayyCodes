package Striver_Dsa.basicExamples;
import java.util.*;

public class printDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter a number");
        int number = sc.nextInt();

        sumDivisors(number);
        if (number == 0) {
            System.out.println("Pls enter another number");
        }
        sc.close();
    }
    static void sumDivisors(int N){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= Math.sqrt(N); i++){
            if (N % i == 0) {
                list.add(i);
                if (N/i != i) {  //  IMP : (N/i)*i : CONTRIBUTION TECHNIQUE
                    list.add(N/i);
                }
            }
        }
        // Sorting the List:
        Collections.sort(list); 

        // Displaying the List:
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

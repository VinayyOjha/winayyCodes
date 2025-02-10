package Striver_Dsa.basicExamples;
import java.util.*;

public class checkPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;

        for(int i = 2; i < Math.sqrt(num); i++){ 
            if (num % i == 0) {
                // System.out.println("Prime");
                count += 1;
                break;
            }

            // else{
            //     System.out.println("Not Prime");
            // }
        }

        if (count == 0){
            System.out.println("Prime");
        }

        else{
            System.out.println("Not Prime");
        }
        s.close();
    }
}

package RMT_Lab;
import java.util.*;

public class threeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        String name = "GAjendra_001";
        System.out.println(name);
        System.out.println(name.charAt(3));
        int a = 0, b = 0, c = 0;

        n = sc.nextInt();

        a = n%10;
        n = n/10;

        b = n%10;
        n = n/10;

        // c = n%10;
        // if (a > b){
        //     if(a > c) {
        //         System.out.println("The greatest digit is :  " + a);
        //     }
        //     else System.out.println(c);
        // }else{
        //     if(b > c) System.out.println(b);
        //     else System.out.println(c);
        // }
    }
}


/*
    
 */
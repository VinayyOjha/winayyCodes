package Striver_Dsa.basicExamples;
// NOTE : ARMSTRONG NUMBER: If the number of digits in a given number is 'X'. Then, if the Sum of each digits raised to X is equal to the given number, such a nnumber is called as an Armstorng Number.
/*
    371 = 3^3 + 7^3 + 1^3   
    370 = 3^3 + 7^3 + 1^3
    1634 = 1^4 + 6^4 + 3^4 + 4^4
 */

import java.util.*;

public class Armstrongx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(checkPallindrome(number));
        sc.close();
    }
    static boolean checkPallindrome(int x){
        String s = String.valueOf(x);
        int length = s.length();
        int temp = x;
        int sum = 0;

        for(int i = 0; i < length; i++){ 
            int a = x % 10;
            double b = Math.pow(a, length); // Finding the exponent.
            sum +=  (int)b ; // Type casting
            x /= 10;
        }

        // while (x > 0) {
        //     int a = x % 10;
        //     sum = sum + a*a*a;
        //     x /= 10;
        // }
        return temp == sum;
    }
}

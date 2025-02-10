package Basics;
import java.util.*;

import Basics.Topic_Functions;

public class Topic_Functions {
    public static void main(String[] args) {

        Topic_Functions object = new Topic_Functions();
        object.newGreet("Vinay");
        // String msg = newGreet("Vinay");
        // System.out.println("hey " + msg);
        /*  IMP :
         If a method is defined as "STATIC", we do not require creating an object and the method can be utilised freely within allowed restrictions.
         */

        int ans = sum(); // function call
        String message = greet();
        // String newMessage = newGreet("Vinay Ojha");
        
        System.out.println("the sum is " + ans);
        System.out.println("And the message is: " + message);
        
        // int SUM3 = sum3(2, 32); //IMP: Function can also be called in the folloeing way as well.
        System.out.println("And the ssum is: " + sum3(211, 0));
    }

     String newGreet( String greets){
        String disp = "yo, " + greets;
        return disp;
    }

static int sum(){
    Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        
        System.out.println("Enter number 1");
        num1 = sc.nextInt();
        System.out.println("Enter number 2");
        num2 = sc.nextInt();
        sum = num1 + num2;
        // System.out.println("The sum is" + sum);
        sc.close();
        return sum;
}

static String greet(){
    String greeting = "how are you?";
    return greeting;
}

static int sum3(int a, int b){
    int sum = a + b;
    return sum;
}
}

package Basics;
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        int ans = sum(); // function call
        System.out.println(ans);
    }

    // NOTE : This function is declared "static" because we are not using it through an object of the class "func".
    static int sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter number 1:");
        num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        sc.close(); // Close the scanner before returning the value
        return sum;
    }
}

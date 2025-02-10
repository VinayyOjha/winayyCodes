package Striver_Dsa.basicExamples;

public class ReverseNumber {
    static int reverse( int x){
        int revN = 0;
        while (x > 0 || x  < 0) {
            int a = x  % 10;
            revN = revN*10 + a;
            x = x/10;
        }
        return revN;
    }

    public static void main(String[] args) {
        int reversedNumber = reverse(1534236469);
        System.out.println(reversedNumber);
    }
}

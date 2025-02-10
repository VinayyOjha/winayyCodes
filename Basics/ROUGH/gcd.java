package ROUGH;

public class gcd {
    public static void main(String[] args) {
        int a = 36;
        int b = 37;
        System.out.println(getGCD(a,b));
    }
    static int getGCD(int a, int b){
        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0) return b;
        else return a;
    }
}

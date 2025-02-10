package Striver_Dsa.basicExamples;

public class CheckPallindrone {
    static boolean isPallindrome(int x){
        int dup = x;
        int revNumber = 0;
        while (x > 0) {
            int ld = x % 10;
            revNumber = revNumber*10 + ld;
            x /= 10;
        }
        return dup == revNumber;
    }

    public static void main(String[] args){
        System.out.println(isPallindrome(1221));
    }
}

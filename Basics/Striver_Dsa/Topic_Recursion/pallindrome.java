package Striver_Dsa.Topic_Recursion;

public class pallindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean a = isPalindrome(s);
        System.out.println(a);
    }
    static boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length()-1;
        return helper(s, a, b);
    }
    static boolean helper(String a, int start, int last){
        if(start >= last) return true;

        if(!Character.isLetterOrDigit(a.charAt(start))){
            return helper(a, start+1, last);
        }
        if(!Character.isLetterOrDigit(a.charAt(last))){
            return helper(a, start, last-1);
        }
        if(Character.toLowerCase(a.charAt(start)) != Character.toLowerCase(a.charAt(last))){
            return false;
        }
        return helper(a, start+1, last-1);
    }

}

package ROUGH;

import java.util.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "12345ab@#$%^&*#$#$^^&&%#a54321";
        System.out.println(isPallindroem(s));
    }

    static boolean isPallindroem(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[, . @ # & $ % ^ *]", "");
        s = s.replaceAll(" ", "");
        char[] arr = new char[s.length()];
        char[] temp = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        int a = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            temp[a] = s.charAt(i);
            a++;
        }
        System.out.println(arr);
        System.out.println(temp);
        return Arrays.equals(arr, temp);
    }

    static boolean helper(int i, int j, ArrayList<Character> list) {
        if (i >= j) {
            return true;
        }
        if (list.get(i) == list.get(j)) {
            return helper(i + 1, j - 1, list);
        } else
            return false;
    }
}

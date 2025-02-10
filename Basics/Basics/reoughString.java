package Basics;

public class reoughString {
    public static void main(String[] args) {
        String stringArray = "MONU";
        String temp = reversedArray(stringArray);
        System.out.println(temp);
    }

    static String reversedArray(String s){
        int size = s.length();
        char[] ch = s.toCharArray();
        char[] temp = new char[size];
        int j = 0;
        for(int i = (size - 1); i >= 0 ; i--){ 
            temp[j] = ch[i];
            j++;
        }
        String reversedString = String.valueOf(temp);
        return reversedString;
    }
}

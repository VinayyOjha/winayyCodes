package GFC_Contest;

public class Substrings {
    public static void main(String[] args) {
        String S = "201";
        int subArrayCount = 0;
        int[] digits = new int[S.length()];
        
        for(int i = 0; i < S.length(); i++){
            digits[i] = S.charAt(i) - '0';
        }
        
        for(int i = 0; i < digits.length; i++){
            if(digits[i] == 0) continue;
            for(int j = i; j < digits.length; j++){
                
                if((digits[i]*10 + digits[j]) % 2 ==1){
                    subArrayCount++;
                    System.out.println(digits[i]*10 + digits[j]);
                }

            }
        }
        System.out.println(subArrayCount);
    }
}

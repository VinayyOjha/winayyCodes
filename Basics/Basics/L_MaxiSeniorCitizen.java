package Basics;

public class L_MaxiSeniorCitizen {
    public static void main(String[] args){
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ageCount = 0;

        for(String a : details){
            String modifiedString = a.substring(11, a.length() - 2);
            int number = Integer.parseInt(modifiedString);
            
            if(number > 60) ageCount++;
        }
        System.out.println(ageCount);
    }
}

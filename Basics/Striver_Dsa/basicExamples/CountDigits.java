package Striver_Dsa.basicExamples;

class CountDigits{
    public static void main(String[] args){
        
        int divides = evenlyDivides( 22074);
        System.out.println(divides);
    }
    static int evenlyDivides(int N){
        // code here
        int count = 0;
        int temp = N;
        while( N > 0){
            int a = N % 10;
            if (a != 0 && (temp % a) == 0){
                count++;
            }
            N = N / 10;
        }
        return count;
    }
}
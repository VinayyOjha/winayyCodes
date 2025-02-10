package ROUGH;
// import java.util.*;

public class printAllDivisors{
    public static void main(String[] args){
        int N = 421;
        countNumbers(N);
    }
    static void countNumbers(int N){
        int count = 0;
        for(int i = 2; i*i < N; i++){
            if(N % i == 0){
                count += 1;
            }
            if (count == 1){
                System.out.println("Not a Prime"); break;
            }
        }

        if(count == 0){
            System.out.println("Prime");
        } 
    }
}
/* 
    N = 5
    F(1) = 1 =          1
    F(2) = 1 + 2 =      3
    F(3) = 1 + 3 =      4
    F(4) = 1 + 2 + 4 =  7
    F(5) = 1 + 5 =      6

 */
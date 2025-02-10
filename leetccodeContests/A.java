import java.util.*;
public class A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            if (N <= 1399) System.out.println("Division 4");
            else if (N <= 1599 && N >= 1400) System.out.println("Division 3");
            else if (N <= 1899 && N >=1600) System.out.println("Division 2");
            else System.out.println("Division 1");
            
        }
    }
}
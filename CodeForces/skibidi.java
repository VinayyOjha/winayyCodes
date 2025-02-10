import java.util.*;
public class skibidi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            String ans = "";
            if (s.equals("us")) System.out.print("i");
            else{
                int n = s.length();
                for(int i = 0; i < n-2; i++){
                    ans += s.charAt(i);
                }

                ans += "i";
            }

            System.out.println(ans);
        }
    }
}

// import java.util.*;

// public class skibidi {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             String s = sc.next();
            
//             if (s.equals("us")) {
//                 System.out.println("i");
//             }
            
//             int n = s.length();
//             StringBuilder ans = new StringBuilder();
            
//             for (int i = 0; i < n - 2; i++) {
//                 ans.append(s.charAt(i));
//             }

//             ans.append("i");
//             System.out.println(ans.toString());
//         }
//         sc.close();
//     }
// }

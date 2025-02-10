#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        int n;
        cin>>n;

        int cnt[26];
        string s;
        cin>>s;
        int sum = 0;
        for (int i = 0; i < n; i++){
            cnt[s[i] - 'A']++;
        }

        for (int i = 0; i < 26; i++){
            // if (cnt[i] == 1) sum += 2;
            // if (cnt[i] > 1) sum = sum + cnt[i] + 1;
            cout << cnt[i] + " ";
        }
        cout<< endl;
    }
}
import java.util.*;
import java.util.Map.Entry;
public class  C1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String res = "";
        int i = 0, j = 1; String max = ""; int val = -1;
        HashMap<String, Integer> map = new HashMap<>(); int a = 0;
        res = "" + s.charAt(i) + s.charAt(j);
    
        while(j < N){
            map.put(res, map.getOrDefault(res, 0) + 1);

            res = res.replace(Character.toString(s.charAt(i)), Character.toString(s.charAt(j)));
            res = res.replace(Character.toString(s.charAt(j)),Character.toString(s.charAt(j++)));
        }
       for(Entry<String,Integer> entry : map.entrySet()){
                if (entry.getValue() > val) {
                    max = entry.getKey();
                    val = entry.getValue();
                }
            }
        System.out.println(max);
    }
}
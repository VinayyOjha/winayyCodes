import java.util.*;
import java.util.Map.*;

public class Topic_HashMap {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String temp = "kjakjbbabbkabakjdkbbabwqytvdfxzc";

        // Creating HashMap
        // 1] .get(key) | .put(key,value) | .replace(key,newValue)

        // 2] .containsKey(key) | .containsValue(value)

        // 3] .remove(key)

        // 4] for each .keySet() | .valueSet()

        // 5] .size() | obj1.equals(obj2)

        // Inserting in HashMap
        for(int i=0;i<temp.length();++i){
            char ch = temp.charAt(i);

            if(map.containsKey(ch)){
                map.replace(ch,(int)map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }

        // HashMap View and Set View
        System.out.println("HashMap View : "+map);
        System.out.println("Set View : "+map.entrySet());

        // 5] Iterating key value pair : import java.util.Map.Entry
        // .getKey() | .getValue()
        for(Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        

        // NOTE -> 
        // {a=229, b=239, c=267, d=243, e=251, f=253, g=243, h=228, i=246, j=240, k=243, l=260, m=250, n=252, o=247, p=228, q=247, r=235, s=241, t=252, u=266, v=250, w=249, x=226, y=239, z=260}

        // {a=229, b=239, c=267, d=243, e=251, f=253, g=243, h=228, i=246, j=240, k=243, l=260, m=250, n=252, o=247, p=228, q=247, r=235, s=241, t=252, u=266, v=250, w=249, x=226, y=239, z=260}
        /*
         *for(char key : map1.keySet()){
            if(map2.containsKey(key)){
            ->    if((int)map1.get(key) != (int)map2.get(key)){
                    ans = false;
                    break;
                }
            }else{
                ans = false;
                break;
            }
        }
        map1.get(key) == map2.get(key) = fale because we are comparing two objects of class Integer and not two int values.
         */
        
        //  ->  Method to store an array with dulplicates in a hashmap and accessing each values
    /*    
        class Solution {
            public int singleNonDuplicate(int[] nums) {
                HashMap<Integer, Integer> map = new HashMap<>();
        
                for (int num : nums){
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
        
                System.out.println(map);
                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    if (entry.getValue() == 1) return entry.getKey();
                }
        
                return 0;
    */
            }
        }
    }
}
        
    }
}

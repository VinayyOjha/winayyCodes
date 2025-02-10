import java.util.HashSet;
class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int size = 0;
        int sizeOfLongestString = -1;
        HashSet<Character> set = new HashSet<>();
        
        int i = 0, j = 0;
        
        while (j < s.length()){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
                size--;
            }
            
            set.add(s.charAt(j));
            j++; size++;
            
            sizeOfLongestString = Math.max(size, sizeOfLongestString);
        }
        
        return sizeOfLongestString;
    }
}

class longestSubstring {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "geeksforgeeks";
        System.out.println(s.longestUniqueSubstr(str));
    }
}
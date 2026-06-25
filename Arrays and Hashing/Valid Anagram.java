/* Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

Approach - 
Check if both string lengths are equal (if not, they cannot be anagrams)
Create a hashmap for each string.
Add characters to the hashmap, updating key  by 1 each time encountered (Using getOrDefault()) 
Check if both hashmaps are equal. 

Note - getOrDefault returns the value from the hashmap. If such a value does not exist then it returns the default value (c1,0 in this case)

Time Complexity - O(n)
Space Complexity - O(n)

*/
import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; 
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c1:s.toCharArray()){
            map1.put(c1,map1.getOrDefault(c1,0)+1);
        }
        for(char c2:t.toCharArray()){
            map2.put(c2,map2.getOrDefault(c2,0)+1);
        }
        return (map1.equals(map2));

    }
}

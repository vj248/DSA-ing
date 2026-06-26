/* You are given an array of strings strs. Return the longest common prefix of all the strings.

Approach - 
Consider the first element of the Array to be the prefix.
Check with the next element, and delete any characters from the prefix that don't match (by creating a substring from the prefix)
If the substring is empty, then return ""

Alternate - Use Stringbuilder to lexicographically sort the array. Then compare the first and last elements and find their common prefix. 
TC - O(nlogn x m) SC - O(m)+any sorting overhead

Time Complexity - O(n x m) {n = strs.length, m = length of prefix}
Space Complexity - O(1)
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null) return "";
        String prefix = strs[0];
        for(int i=0;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);

                if (prefix.isEmpty()) return "";
            }

        }
        return prefix;
    }
}
/*Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Approach - 
Create an Empty HashSet.
Check if HashSet already contains a number (set.contains(num)) -> return true
If not, add it to the set (set.add(num))

Time Complexity - O(n)
Space Complexity - O(n)
*/
import java.util.*;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if (set.contains(num)){
                return true;
            }
        set.add(num);
        }
    return false;

    }
}
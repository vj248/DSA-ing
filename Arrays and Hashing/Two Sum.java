/* Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j

Approach - 
Create a Hashmap to store nums and their indices.
Calculate Target - Num and check if this complement exists in the Hashmap already. 
If not, then add the element to the Map
If complement exists, then return indices of the complement and i (index of the number)

Time Complexity - O(n)
Space Complexity - O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }
}

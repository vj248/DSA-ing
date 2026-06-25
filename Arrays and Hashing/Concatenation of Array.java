/*You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Approach - 
Create an ans array of size 2n
Copy nums into i and n+i positions

Time Complexity - O(n)
Space Complexity - O(n)
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
        ans[i] = nums[i];
        ans[n+i] = nums[i];}
        return ans;
    }
}
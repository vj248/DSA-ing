/* Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

Approach - 
When sorted, all anagrams will be the same. (ate,tea will become aet,aet)
Create a hashmap with the key as the sorted array element, and store a list with the word against that key

Time Complexity - O(n * k log k)
Space Complexity - O(n * k)
where n = strs.length, k = avg length of strings in strs

Alternate - 
A more optimal method is using a hashmap where each string is represented as a 26 character tuple, representing alphabets.
The tuple is changed depending on the alphabet encountered while iterating
Then compare to find anagrams

*/




class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);

        }
        return new ArrayList<>(map.values());
    }
}

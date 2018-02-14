//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null) return result;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
          if(map.containsKey(target-nums[i])){
            result[0] = map.get(target-nums[i]);
            result[1] = i;
            return result;
          }else{
            map.put(nums[i], i);
          }
        }
        
        return result;
    }
}



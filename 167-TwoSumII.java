//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
          if(numbers[start] + numbers[end] == target){
            result[0] = start+1;
            result[1] = end+1;
            return result;
          }
          if(numbers[start] + numbers[end] < target){
            start++;
          }
          if(numbers[start] + numbers[end] > target){
            end--;
          }
        }
        
        return result;
    }
}

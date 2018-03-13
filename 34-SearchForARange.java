class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int leftIndex = searchForTarget(nums, target, true);
        if(leftIndex == nums.length || nums[leftIndex]!=target ) return result;
        result[0] = leftIndex;
        result[1] = searchForTarget(nums, target, false)-1;
        return result;
    }
    private int searchForTarget(int[] nums, int target, boolean left){
        int start = 0; 
        int end = nums.length;
        while(start < end){
          int mid = (end+start)/2;
          if(nums[mid] > target || left && nums[mid] == target){
            end = mid;
          }else{
            start = mid+1;
          }
        }
        return start;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1) return 0;
        int p1 = 0;
        for(int i = 0; i < nums.length; i++){
          if(nums[p1] != nums[i]){
            p1++;
            nums[p1] = nums[i];
          }
        }
        return p1+1;
    }
}

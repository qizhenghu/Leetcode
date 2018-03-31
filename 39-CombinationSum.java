class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtracking(list, new ArrayList<Integer>(), nums, 0, target);
        return list;
    }
    private void backtracking(List<List<Integer>> list, List<Integer> temp, int[] nums, int start, int remain){
        if(remain == 0) list.add(new ArrayList<Integer>(temp));
        if(remain < 0) return;
        if(remain > 0){
          for(int i = start; i < nums.length; i ++){
              temp.add(nums[i]);
              backtracking(list, temp, nums, i, remain - nums[i]);
              temp.remove(temp.size()-1);
          }
        }
        
    }
}

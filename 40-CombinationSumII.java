class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtracking(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
    
    private void backtracking(List<List<Integer>> list, List<Integer> temp, int[] nums, int remain, int start){
        if(remain < 0) return;
        if(remain == 0) list.add(new ArrayList<Integer>(temp));
        if(remain > 0){
          for(int i = start; i < nums.length; i++){
              if(i > start && nums[i] == nums[i-1]) continue;
              temp.add(nums[i]);
              backtracking(list, temp, nums, remain - nums[i], i+1);
              temp.remove(temp.size()-1);
          }
        }
    }
}

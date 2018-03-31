class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtracking(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return list;
    }
    
    private void backtracking(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] used){
      if(temp.size() == nums.length) {
        list.add(new ArrayList<Integer>(temp));
      }else{
        for(int i = 0; i < nums.length; i ++){
          if(used[i] || i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
        
          temp.add(nums[i]);
          used[i] = true;
          backtracking(list,temp, nums,used);
          temp.remove(temp.size()-1);
          used[i] = false;
        }
      }   
    }
}

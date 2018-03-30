class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int state){
        list.add(new ArrayList<Integer>(temp));
        for(int i = state; i < nums.length; i ++){
          if(i> state && nums[i] == nums[i-1]) continue;
          temp.add(nums[i]);
          backtrack(list, temp, nums, i + 1);
          temp.remove(temp.size()-1);
        }
    } 
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtracking(list, new ArrayList<Integer>(), nums);
        return list;
        
    }
    
    private void backtracking (List<List<Integer>> list, List<Integer> temp, int[] nums){
      if(temp.size() == nums.length){
        list.add(new ArrayList<Integer>(temp));
      }else{
        for(int i = 0; i < nums.length; i++){
          if(temp.contains(nums[i])) continue;
          temp.add(nums[i]);
          backtracking(list, temp, nums);
          temp.remove(temp.size()-1);
        }
      }  
      
    }
}

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtracking(list, new ArrayList<String>(), s, 0);
        return list;
        
    }
    
    private void backtracking(List<List<String>> list, List<String> temp, String s, int start){
        if(start == s.length()) list.add(new ArrayList(temp));
        
        for(int i = start; i < s.length(); i++){
          if(isParlindrome(s, start, i)){
            temp.add(s.substring(start, i+1));
            backtracking(list, temp, s, i+1);
            temp.remove(temp.size()-1);
          }       
        }
      
    }
    
    private boolean isParlindrome(String s, int low, int high){
      if(low == high) return true;
      while(low < high){
        if(s.charAt(low) != s.charAt(high)) return false;
        low ++;
        high--;
      }
      return true;
    }
}

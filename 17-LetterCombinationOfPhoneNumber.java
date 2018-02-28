class Solution {
    private String[] mapping = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new LinkedList<String>();
        if(digits ==null || digits.length() < 1)return result;
        combination(result, 0, "", digits);
        return result;
    }
    
    public void combination(List<String> result, int start, String prefix, String digits){
        if(start >= digits.length()){
          result.add(prefix);
          return;
        }
        String position = mapping[(digits.charAt(start)-'0')];
        for(int i = 0; i < position.length(); i++){
          combination(result, start+1, prefix+position.charAt(i), digits);
        }
    }
}

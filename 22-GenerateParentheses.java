class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        formParenthesis(result, 0, 0, "", n);
        return result;
    }
    public void formParenthesis(List<String> result, int left, int right, String prefix, int max){
        if(prefix.length() >= max*2){
          result.add(prefix);
          return;
        }
        if(left < max){
          formParenthesis(result, left+1, right, prefix + "(", max);
        }
        if(right < left){
          formParenthesis(result, left, right+1, prefix + ")", max);
        }
    }
}

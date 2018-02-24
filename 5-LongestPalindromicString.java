class Solution {
    private int max, low;
    
    public String longestPalindrome(String s) {
        if(s==null ||s.length()<2) return s;
        for(int i = 0; i < s.length()-1; i++){         
          subPalindrome(s, i, i);
          subPalindrome(s, i, i+1);        
        }
        return s.substring(low, low+max);
    }
    
    public void subPalindrome(String s, int start, int end){
      while(start >=0 && end<s.length() && s.charAt(start) == s.charAt(end)){        
          start--;
          end++;        
      }
      if(end-start-1>max){
        max = end-start-1;
        low = start+1;
      }
    }
}

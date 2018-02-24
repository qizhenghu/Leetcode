class Solution {
    public String longestCommonPrefix(String[] strs) {
         
        if(strs == null || strs.length < 1) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
          prefix = commonPrefix(prefix, strs[i]);
        }
        return prefix;
    }
    
    public String commonPrefix(String s1, String s2){
       int len = Math.min(s1.length(), s2.length());
       int i = 0;
       while(i < len && s1.charAt(i) == s2.charAt(i)){
          i++;
       }
       return s1.substring(0, i);
       
    }
}

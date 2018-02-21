class Solution {
    public String reverseWords(String s) {
        if(s == null) return null;
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder;
        for(int i = 0; i < list.length; i++){
          sb.append(new StringBuilder(s[i]).reverse().toString());
          sb.append(" ");
        }
        return sb.toString().trim();
    }
    
}

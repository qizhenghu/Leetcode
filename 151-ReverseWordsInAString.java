public class Solution {
    public String reverseWords(String s) {
        String[] list = s.split("\\s+");
        String result = "";
        for(int i = list.length-1; i >=0; i --){
          result += list[i] + " ";
        }
        return result.trim();
    }
}

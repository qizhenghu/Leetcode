class Solution {
    public boolean isValid(String s) {
        if(s==null||s.length()<1) return true;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i ++){
          char c = s.charAt(i);
          if(c == '(' || c == '{' || c == '['){
            stack.push(c);
          }else if(c == ')' && !stack.empty() && stack.peek()=='('){
            stack.pop();
          }else if(c == '}' && !stack.empty() && stack.peek()=='{'){
            stack.pop();
          }else if(c == ']' && !stack.empty() && stack.peek()=='['){
            stack.pop();
          }else{
            return false;
          }
        }
        return stack.empty();
    }
}

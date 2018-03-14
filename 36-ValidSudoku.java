class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9; i ++){
          if(!isSubSudokuValid(board, i, i, 0, 8)) return false;
          if(!isSubSudokuValid(board, 0, 8, i, i)) return false;
        }
        for(int i = 0; i < 3; i ++){
          for(int j = 0; j < 3; j ++){
            if(!isSubSudokuValid(board, i*3, i*3+2, j*3, j*3+2)) return false;
          }
        }
        return true;
    }
    public boolean isSubSudokuValid(char[][] board, int left, int right, int top, int down){
        Set<Character> set = new HashSet<Character>();
        for(int i = left; i <= right; i ++){
            for(int j = top; j <= down; j ++){
                char c = board[i][j];
                if(c!='.'){
                    if(set.contains(c)){
                        return false;
                    }else{
                        set.add(c);
                    }
                }
                
            }
            
        }
        return true;       
    }
}

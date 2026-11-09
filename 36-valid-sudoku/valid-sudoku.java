class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> hs3 = new HashSet<>();
        HashSet<Character> hs4 = new HashSet<>();
        HashSet<Character> hs5 = new HashSet<>();

        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> hs1 = new HashSet<>();
            HashSet<Character> hs2 = new HashSet<>();
            if(i%3 ==  0){
                hs3.clear();
                hs4.clear();
                hs5.clear();
            }
            

            for(int j = 0; j < 9 ; j++){
                if(board[i][j] != '.' && !(hs1.add(board[i][j]))){
                    return false;
                }
                if(board[j][i] != '.' && !(hs2.add(board[j][i]))){
                    return false;
                }
                if(j < 3){
                    if(board[i][j] != '.' && !(hs3.add(board[i][j]))){
                        return false;
                    }
                }
                else if(j < 6){
                    if(board[i][j] != '.' && !(hs4.add(board[i][j]))){
                        return false;
                    }
                }
                else if(j < 9){
                    if(board[i][j] != '.' && !(hs5.add(board[i][j]))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
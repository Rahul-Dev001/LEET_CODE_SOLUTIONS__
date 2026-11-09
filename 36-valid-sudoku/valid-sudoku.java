class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> hs3 = new HashSet<>();
        HashSet<Character> hs4 = new HashSet<>();
        HashSet<Character> hs5 = new HashSet<>();

        for(int i = 0 ; i < 9 ; i++){
            // initiated them in the outer loop so that they reset after each iteration of the outer loop
            HashSet<Character> hs1 = new HashSet<>();
            HashSet<Character> hs2 = new HashSet<>();

            //reset the three hashset containing the info of the 3 smaller 3x3 cubes
            if(i%3 ==  0){
                hs3.clear();
                hs4.clear();
                hs5.clear();
            }
            

            for(int j = 0; j < 9 ; j++){

                // below two loops check the horizontal and vertical checks in sudoku we use ij and ji to do so

                if(board[i][j] != '.' && !(hs1.add(board[i][j]))){
                    return false;
                }
                if(board[j][i] != '.' && !(hs2.add(board[j][i]))){
                    return false;
                }

                // below three loops check for the three 3x3 cubes horizontallyin three iterations of outer loop i

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
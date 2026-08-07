class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];

        for(int a=0; a<9; a++){
            rows[a] = new HashSet<>();
            cols[a] = new HashSet<>();
            squares[a] = new HashSet<>();
        }

        for(int i=0; i < 9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') continue;

                int div = (i/3)*3 + (j/3);

                if(rows[i].contains(board[i][j]) || 
                    cols[j].contains(board[i][j]) ||
                    squares[div].contains(board[i][j])){
                    return false;
                }
                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                squares[div].add(board[i][j]);
            }
        }
        return true;
    }
}

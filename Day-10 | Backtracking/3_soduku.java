class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char [][]board){
        for(int i=0;i<9;i++){
            for(int j =0;j<9;j++){
                if(board[i][j] == '.'){
                    for(char k = '1';k<='9';k++){
                        if(valid(board, i, j, k)){
                            board[i][j] = k;
                            // once all filled return true;
                            if(solve(board))return true;
                            board[i][j] = '.';
                        }
                    }
                    // when it is not possible to fill
                    return false;
                }
            }
        }
        // when every gap is filled
        return true;
    }
    public boolean valid(char board[][], int row, int col, char k){
        int rowStart = 3*(row/3);
        int colStart = 3*(col/3);
        for(int i =0;i<9;i++){
            if(board[row][i] == k)return false;
            if(board[i][col] == k)return false;
            int oneIncre = i%3; // for incrementing the column
            int threeIncre = i/3; // for incrementing the row
            if(board[rowStart+threeIncre][colStart+oneIncre] == k)return false;
        }
        return true;
    }

}

class Solution {
    public List<List<String>> solveNQueens(int n) {
        char grid[][] = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(grid[i], '.');
        }
        List<List<String>>ans = new ArrayList<>();
        rec(grid, ans, 0, n);
        return ans;
    }
    public void rec(char grid[][], List<List<String>>ans, int col, int n){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(grid[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row=0; row<n;row++){
            if(isValid(grid, row, col,n)){
                grid[row][col] = 'Q';
                rec(grid, ans, col+1, n);
                grid[row][col] = '.';
            }
        }
    }
    public boolean isValid(char grid[][], int row, int col,int n){
            int i = row, j = col;
            while(j>=0){
                if(grid[i][j] == 'Q')return false;
                j--;
            }
            i = row; j = col;
            while(i>=0 && j>=0){
                if(grid[i][j] == 'Q')return false;
                i--;
                j--;
            }
            i = row; j = col;
            while(j>=0 && i<n){
                if(grid[i][j] == 'Q')return false;
                j--;
                i++;
            }
        
        return true;
    }
}


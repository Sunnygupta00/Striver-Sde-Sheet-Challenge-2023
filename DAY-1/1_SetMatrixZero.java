// brute force 
//Time : O((N*M)*(N + M)) + O(N*M)
// space : O(m*n)
class Solution {
    public void setZeroes(int[][] matrix) {
     int n = matrix.length;
     int m = matrix[0].length;
         ArrayList<int[]> store = new ArrayList<>();
         for(int i=0;i<n;i++){
             for(int j = 0;j<m;j++){
                if(matrix[i][j] == 0){
                    store.add(new int[]{i, j});
                }
             }
         }
         for(int i[] : store){
             fillCol(matrix, n, i[1]);
             fillRow(matrix,i[0], m);
         }

    }
    public void fillCol(int arr[][], int row, int col){
        for(int i = 0;i<row;i++){
            arr[i][col] = 0;
        }
    }
     public void fillRow(int arr[][], int row, int col){
        for(int i = 0;i<col;i++){
            arr[row][i] = 0;
        }
    }
}
// better : we can optimise space
// time : O((N*M)*(N + M)) + O(N*M)
// space : O(m)+O(n)
time

class Solution {
    public void setZeroes(int[][] matrix) {
     int n = matrix.length;
     int m = matrix[0].length;
     boolean row[] = new boolean[n];
     boolean col[] = new boolean[m];
         ArrayList<int[]> store = new ArrayList<>();
         for(int i=0;i<n;i++){
             for(int j = 0;j<m;j++){
                if(matrix[i][j] == 0){
                   row[i] = true;
                   col[j] = true;
                }
             }
         }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] == true || col[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }

    }
    public void fillCol(int arr[][], int row, int col){
        for(int i = 0;i<row;i++){
            arr[i][col] = 0;
        }
    }
     public void fillRow(int arr[][], int row, int col){
        for(int i = 0;i<col;i++){
            arr[row][i] = 0;
        }
    }
}


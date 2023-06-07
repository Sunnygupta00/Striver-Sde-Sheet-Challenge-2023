// first swap ij to ji
// then reverse or observe the input output


class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j = i;j<m;j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix,i, m-1);
        }      
        
    }
    public void reverse(int [][]matrix,int row, int col ){
        int start = 0;
        int end = col;
        while(start<=end){
            swap(matrix, row, start, row, end);
            start++;
            end--;
        }
    }
    public void swap(int [][]matrix, int a, int b, int x, int y){
        int temp = matrix[a][b];
        matrix[a][b] = matrix[x][y];
        matrix[x][y] = temp;
    }
}

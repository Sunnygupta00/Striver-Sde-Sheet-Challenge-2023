// matrix is in sorted way of rows then we can use Binary search
// Time : O(n+m)
// space : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(i<n && j>=0){
            int element = matrix[i][j];
            if(element == target){
                return true;
            }else if(element>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}


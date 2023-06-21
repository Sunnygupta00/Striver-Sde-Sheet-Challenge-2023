
// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
       ArrayList<String> ans = new ArrayList<>();
       rec(0, 0, n, m, ans, new StringBuilder());
       return ans;
    }
    private static int dir[][] = {{-1,0},{1,0},{0,-1}, {0,1}};
    private static char path[] = {'U','D','L','R'};
    public static void rec(int i, int j, int n, int [][]grid, ArrayList<String>ans, StringBuilder sb){
         if(i == n-1 && j == n-1){
           if(grid[i][j]!=0){
                 ans.add(sb.toString());
           }
            return;
        }
        if(i<0 || j<0 || i>=n || j>=n || grid[i][j] == 0){
            return;
        }
        // if condition meet
       
        for(int a = 0; a<4; a++){
            int row = i+dir[a][0];
            int col = j+dir[a][1];
            sb.append(path[a]);
            // marking visited
            grid[i][j] = 0;
            rec(row, col, n, grid, ans,sb);
            grid[i][j] = 1;
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
}

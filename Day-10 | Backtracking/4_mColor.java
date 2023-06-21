
class solve {
    // input is given in n*n grid
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
       int col[] = new int[n];
      return solve(0, graph, col, n, m);
    }
    public boolean solve(int node, boolean graph[][], int col[], int n, int m){
        if(node == n)return true;
        
        for(int i =1;i<=m;i++){
            if(possible(graph[node],  col, i, n)){
                col[node] = i;
                if(solve(node+1, graph, col, n, m))return true;
                col[node] = 0;
                
            }
        }
        return false;
    }
    public boolean possible(boolean graph[],int colour[],  int col, int n){
        for(int i=0;i<n;i++){
            // if there is any node and have same adjacent colour
            if(graph[i] == true && colour[i] == col)return false;
        }
        return true;
    }
}

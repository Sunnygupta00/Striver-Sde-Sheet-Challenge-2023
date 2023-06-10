
//Time: O2^(n+m)
//space : recursion
class Solution {
    public int uniquePaths(int m, int n) {
        return rec(m-1,n-1);
    }
    public int rec(int n, int m){
        if(n<0 || m<0){
            return 0;
        }
        if(n == 0 && m == 0){
            return 1;
        }
        int up = rec(n-1, m);
        int down = rec(n, m-1);
        return up+down;
    }
}

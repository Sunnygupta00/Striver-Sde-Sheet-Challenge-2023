
// BRUTE : O(N)
// SPACE : O(1)

class Solution {
    public double myPow(double x, int y) {
        if(y == 0)return 1d;
       int n = y>0? y : -y;
        double ans = 1d;
        for(int i=0;i<n;i++){
            ans*=x;
        }
        return y>0 ? ans : (1d/ans);        
    }
}

// BRUTE : O(LOGN)
// SPACE : O(1)
// num :  2^10
// 4^5
// 4*4^4
// 4*16*16
class Solution {
    public double myPow(double x, int n) {
    double ans = 1d;
    if(n<0){
        n=-n;
        x = 1/x;
    }
    while(n!=0){
        if(n%2!=0){
            ans*=x;
        }
        x*=x;
        n = n>>>1;
    }
    return ans;
        
    }
}

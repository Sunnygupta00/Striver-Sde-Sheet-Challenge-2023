public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int start = 1;
        int end = m;
        while(start <= end){
            int mid = start+(end-start)/2;
            long res = nextMove(mid, n, m);  // intead of this we can also use Math.pow(x,n);
            if( res == 0){
                return mid;
            }else if(res == 1){
               start = mid+1;
            }else{
               end= mid-1;
            }
        }        
        return -1;
    }
    public static int nextMove(int n, int pow, int m){
        long ans = 1;
        for(int i=0;i<pow;i++){
            ans*=n;
            if(ans >m){ // if it exeeds
                return 2;
            }
        }
        if(ans < m)return 1;// if it is less
        return 0; // if it is equal
    }
}

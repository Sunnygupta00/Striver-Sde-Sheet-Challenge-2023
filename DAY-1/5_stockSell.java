// using simple two pointer appraoch
// time : O(n)
// space : O(n);

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int ans = 0;
        int n = prices.length;
        while(right<n){
            if(prices[right]>prices[left]){
                ans = Math.max(ans, prices[right]-prices[left]);
            }else{
                left = right;
            }
            right++;
        }
        return ans;
    }
}

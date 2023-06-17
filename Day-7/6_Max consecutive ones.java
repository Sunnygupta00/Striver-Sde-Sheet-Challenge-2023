// O(n)
// O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevZero = -1;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                prevZero = i;
            }else{
                ans = Math.max(ans, i-prevZero);
            }
        }
        return ans;        
    }
}

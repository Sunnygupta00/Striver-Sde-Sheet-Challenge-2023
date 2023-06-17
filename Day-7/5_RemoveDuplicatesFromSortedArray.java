// bruteForce : use hashSet 
// time : O(n)
// space: O(n)

// optimised : two pointer
// time: O(n);
// space : O(1);
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; 
        if(n == 0 || n== 1)return n;
        int left = 1, right = 1;
        int prev = nums[0];
        while(right<n){
            if(prev == nums[right]){
                right++;
            }else{
                nums[left] = nums[right];
                prev = nums[right];
                left++;
            }
        }
        return left;
    }
}

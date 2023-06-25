// brute force use xor
// optimal : use xor
// simple : logn
class Solution {
    public int singleNonDuplicate(int[] nums) {
       int start = 0;
       int l = nums.length-2;
       int end = l;
       if(l == 0)return nums[0];
       
       while(start<=end){
           int mid = start+(end-start)/2;
           if(nums[mid] == nums[mid^1]){
               start = mid+1;
           }else{
               end = mid-1;
           }
       }
       return nums[start];
    }
}

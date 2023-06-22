// first find the rotated index 
// and then search in that space 
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        int a = bs(nums, 0, start-1, target);
        int b = bs(nums, start, n-1, target);
        return a == -1? b : a;
        
    }
    public int bs(int nums[], int start, int end, int target){
        if(start>end)return -1;
        int mid = start+(end-start)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
           return bs(nums, start, mid-1, target);
        }else{
            return bs(nums, mid+1, end, target);
        }
    }
}

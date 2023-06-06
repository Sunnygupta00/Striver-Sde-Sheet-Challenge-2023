// simple pointers

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i  = 0;
        int left = 0;
        int right = n-1;
        while(i<=right){
            if(nums[i] == 0){
                swap(nums, i++, left++);
            }else if(nums[i] == 2){
                swap(nums, i, right--);
            }else{
                i++;
            }
        }
        
    }
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

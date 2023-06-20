// !n*n

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        rec(nums, ans, 0);
        return ans;
    }
    public void rec(int nums[], List<List<Integer>>ans, int index ){
        if(index == nums.length){
            List<Integer>temp = new ArrayList<>();
            for(int i: nums)temp.add(i);
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums, index, i);
            rec(nums, ans, index+1);
            swap(nums, index, i);
        }
    }
    public void swap( int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

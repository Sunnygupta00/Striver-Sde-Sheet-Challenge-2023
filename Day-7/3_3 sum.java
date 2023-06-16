// simple brute force is that we will run 3 for lops and then take out sum;
// time : O(n^3)
// space : O(1)

// Optimised : first sort and then use two pointer approach 
// time : O(n*n)
// space : O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            // This is to ignore duplucates
            if(i>0 && nums[i] == nums[i-1])continue;
            int start = i+1, end = n-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                     // This is to ignore duplucates
                    while(start<n && nums[start] == nums[start-1]){
                        start++;
                    }
                     // This is to ignore duplucates
                    while(end>=0 && nums[end] == nums[end+1]){
                        end--;
                    }
                }else if(sum <0 ){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return ans;
        
    }
}

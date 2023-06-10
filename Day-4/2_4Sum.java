// Simple using two pointer

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                     int k = j+1;
                     int l = n-1;
                     int part = nums[i]+nums[j];
                     while(k<l){
                         int sum = part+nums[k]+nums[l];
                         if(sum == target){
                             ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                             k++;
                             l--;
                         }else if(sum > target){
                             l--;
                         }else{
                             k++;
                         }
                     }
         }
            
        }
        return new ArrayList<>(ans);
        
    }
}
Console

// here arr will have duplicates value
// time : O(2^n *k)
// space : stack space
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        rec(nums, ans, new ArrayList<>(), nums.length, 0);
        return ans;
    }
    public void rec(int nums[], List<List<Integer>>ans, List<Integer>temp, int n , int index){
        // taking every possible value
        ans.add(new ArrayList<>(temp));
        for(int i = index; i<n; i++){
            // during selection we will not consider duplicate, other wise we can
            if(i> index && nums[i] == nums[i-1])continue;
            temp.add(nums[i]);
            rec(nums, ans, temp, n, i+1);
            temp.remove(temp.size()-1);
        }
    }

}

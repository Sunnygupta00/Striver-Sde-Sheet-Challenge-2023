// brute force : first sort and then find consicutive subsequence
// time : O(nlongn)
// space : O(1)

// optimised : using hashSet and check condition;
// space : O(n)
// time: O(n)

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        int ans = 0;
        for(int i: nums)hs.add(i);
        for(int i: nums){
            if(hs.contains(i-1)){
                continue;
            }
            int count = 1;
            while(hs.contains(i+count)){
                count++;              
            }
            ans = Math.max(ans, count);
        }
        return ans;        
    }
}

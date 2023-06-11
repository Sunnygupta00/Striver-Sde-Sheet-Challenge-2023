// brute force : calculate all subarrays and xor them and then count : time : O(n*n*n)
// better : calculate all subarray along with second loop : time : O(n*n)
// optimised : HashMap is subarray exist store count
// time : O(n)
// space : O(n)


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int n = A.size();
        int ans = 0;
        int xor = 0;
        for(int i=0;i<n;i++){
            xor ^= A.get(i);
            if(hm.containsKey(xor^B)){
                ans += hm.get(xor^B);
            }
           hm.put(xor, hm.getOrDefault(xor, 0)+1);
        }
        return ans;
    }
}

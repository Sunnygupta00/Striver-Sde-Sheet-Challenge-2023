class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        int right = 0;
        int left = 0;
        while(right<s.length()){
            if(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left++));
               
            }else{
                hs.add(s.charAt(right++));
                ans = Math.max(ans, hs.size());
            }
        }
        return ans;
    }
}

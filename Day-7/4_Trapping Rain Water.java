// BRUTE FORCE IS THAT WE WILL FIND UPPER LIMIT FORM LEFT AND RIGHT, AND THEN SUBSTRACT WITH CURR
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            int upperleft = Integer.MIN_VALUE;
            for(int j = 0;j<=i; j++){
                upperleft = Math.max(height[j], upperleft);
            }
            int upperRight = Integer.MIN_VALUE;
            for(int j = n-1;j>=i;j--){
                upperRight = Math.max(height[j], upperRight);
            }
            ans+= Math.min(upperRight, upperleft)-height[i];
        }
        return ans;
        
    }
}
// OPTIMAL INSTEAD OF FINDING AGAIN AND AGAIN WE WILL STORE IT
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            left[i] = Math.max(height[i], left[i-1]);
        }
        for(int j = n-2;j>=0;j--){
            right[j] = Math.max(height[j], right[j+1]);
        }
        for(int i =0;i<n;i++){
            ans+= Math.min(left[i], right[i])-height[i];
        }
        return ans;
        
    }
}

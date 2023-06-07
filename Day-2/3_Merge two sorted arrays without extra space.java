// in merging of two sorted array always prefer to merge from backward
// time : O(n)
// space : O(1)
//-------------------------------------------------------------------------------->

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int o = nums1.length-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 || j>=0){
           if((j<0) || (i>=0 && nums1[i]>nums2[j]) ){
               nums1[o] = nums1[i--];
           }else{
               nums1[o] = nums2[j--];
           }
           o--;
        }
        // while(i>=0){
        //     nums1[o--] = nums1[i--];
        // }
        // while(j>=0){
        //     nums1[o--] = nums2[j--];
        // }
    }
}

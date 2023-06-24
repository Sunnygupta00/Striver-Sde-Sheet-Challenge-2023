// time : O(n+m)
// space : O(n+m)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m  = nums2.length;
        int o = n+m;
        int arr[] = new int [n+m];
        int i =0, j =0 , k =0;
        while(i<n || j<m){
            if(j == m ||(i<n && nums1[i] <nums2[j])){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        if(o%2 == 0){
            return (double)(arr[o/2]+arr[o/2-1])/2.0;
        }else{
            return (double)arr[o/2];
        }
        
    }
}
// better just store the median according to counting
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m  = nums2.length;
        int o = n+m;
        int sum = 0;
        if(o%2 == 0){
            int one = o/2;
            int two = o/2-1;
            int count = 0;
            int i=0, j=0;
            while(i<n || j<m){
                if(j==m || (i<n && nums1[i]<nums2[j])){
                    if(count == one || count == two){
                        sum+=nums1[i];
                    }
                    i++;
                }else{
                     if(count == one || count == two){
                        sum+=nums2[j];
                    }
                    j++;
                }
                count++;
            }
            
            return sum/2.0;
        }else{
             int count = o/2;
            int i=0, j=0;
            while(i<n || j<m){
                if(j==m || (i<n && nums1[i]<nums2[j])){
                    if(count == 0){
                        sum+=nums1[i];
                    }
                    i++;
                }else{
                     if(count == 0){
                        sum+=nums2[j];
                    }
                    j++;
                }
                count--;
            }
            return (double)sum;
        }
        
    }
}

// optimised use l1<=r2 && l2<=r1 partition

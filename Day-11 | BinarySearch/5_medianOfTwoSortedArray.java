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
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2){
            return findMedianSortedArrays(nums2, nums1);
        }
        int length = n1+n2;
        int start = 0;
        int end = n1;
        while(start<=end){
            int cut1 = start+(end-start)/2;
            int cut2 =(length+1)/2- cut1; // adding +1 becuase in odd interger we want max element on left side to maitain the ratio
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2-1];
            int r1 = cut1 == n1? Integer.MAX_VALUE : nums1[cut1];
            int r2 = cut2 == n2? Integer.MAX_VALUE : nums2[cut2];
            if(l1<=r2 && l2<= r1){
                if(length%2 == 0){
                    return (Math.max(l1, l2)+Math.min(r2, r1))/2.0;
                }else{
                    return (double)Math.max(l1, l2);
                }
            }else if(l2> r1){
                start = cut1+1;
            }else{
                end = cut1-1;
            }

        }
        return (double)-1;
        
    }
}

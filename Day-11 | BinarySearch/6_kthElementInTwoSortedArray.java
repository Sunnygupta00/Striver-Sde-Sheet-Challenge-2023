// simple mergesort
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
          int i = 0;
          int j = 0;
          k--; // for Zero based indexing
          while(i<n || j<m){
              if(j == m ||(i<n && arr1[i]<arr2[j])){
                    if(k == 0){
                        return arr1[i];
                    }
                  i++;
              }else{
                   if(k == 0){
                        return arr2[j];
                    }
                  j++;
              }
              k--;
          }
          return -1;
    }
}
// optimal using partition method
// time : logn

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(n>m){
            return kthElement(arr2, arr1, m,  n, k);
        }
        int start = Math.max(0, k-m);
        int end = Math.min(k, n);
        while(start<=end){
            int cut1 = start+(end-start)/2;
            int cut2 = k-cut1;
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1-1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2-1];
            int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2];
            
            if(l1<=r2 && l2 <= r1){
                return Math.max(l1, l2);
            }else if(l1>r2){
                end = cut1-1;
            }else{
                start = cut1+1;
            }
            
        }
        return -1;
    
    }
}

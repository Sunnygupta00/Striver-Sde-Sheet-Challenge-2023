// brute force : run two nested loops and if sum == 0 then count++ 
// time : O(n*n)
// space : O(1)

// Optimised : Using HashMap to account its prev sum
             sum-k
   -k-    ____________
          |           |
[----------------------]
          sum

int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        int sum = 0;
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            sum+= arr[i];
            if(hm.containsKey(sum)){
                ans = Math.max(ans, i-hm.get(sum));
            }else{
                hm.put(sum, i);
            }
        }
        return ans;
    }

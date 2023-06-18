class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int station = 0;
        int i = 0;
        int j = 0;
        int ans = 0;
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                station++;
                i++;
            }else if(arr[i] > dep[j]){
                station--;
                j++;
            }
            ans = Math.max(ans, station);
            
        }
        return ans;
        
    }
    
}
// Optimal
 static int findPlatform(int arr[], int dep[], int n)
    {
       int hash[] = new int[2401];
       for(int i=0;i<n;i++){
           hash[arr[i]]++;
           hash[dep[i]+1]--;
       }
       int ans = 0;
       int sum =0;
       for(int i=0;i<2401;i++){
           sum+= hash[i];
           ans = Math.max(sum, ans);
       }
        return ans;
    }

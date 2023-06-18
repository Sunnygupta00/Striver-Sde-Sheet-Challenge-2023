// Simple pick and not pick solution

class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        rec(arr, n, ans,  0);
        return ans;
        
    }
    void rec(ArrayList<Integer> arr, int n, ArrayList<Integer> ans, int sum ){
      if(n <= 0){
          ans.add(sum);
          return;
      }   
      rec(arr, n-1, ans, sum+arr.get(n-1)); // pick 
      rec(arr, n-1, ans, sum); // not pick
    }
}

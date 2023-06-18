// Simple pick and not pick with little twist

class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(arr, ans, new ArrayList<>(), target, arr.length, 0);
        return ans;
    }
    public void rec(int arr[], List<List<Integer>> ans,List<Integer>temp,  int target, int n, int index){
        if(target <=0  || index == n){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(arr[index]);
        rec(arr, ans, temp, target-arr[index],n, index);
        temp.remove(temp.size()-1);
        rec(arr, ans, temp, target, n, index+1);
    }
}

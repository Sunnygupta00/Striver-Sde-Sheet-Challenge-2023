// int this question we will have some duplicates, to tackle duplicate, we have to pick only unique elements for that will use for loop
// time : O(2^n)*k 
class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        rec(arr, ans, new ArrayList<>(), arr.length, 0, target);
        return ans;
    }
    public void rec(int arr[], List<List<Integer>>ans, List<Integer>temp, int n, int index, int target){
        if(target<=0 || index == n){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=index;i<n;i++){
            // during selection i can't pick duplicate, but in other iteration i can select. because we don't need duplicate pair
            if(i>index && arr[i] == arr[i-1])continue;
            temp.add(arr[i]);
            rec(arr, ans, temp, n, i+1, target-arr[i]);
            temp.remove(temp.size()-1);

        }
    }
}

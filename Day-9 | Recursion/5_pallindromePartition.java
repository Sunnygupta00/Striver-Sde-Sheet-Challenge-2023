class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans = new ArrayList<>();
        rec(s, ans, new ArrayList<>(), s.length(), 0);
        return ans;
    }
    public void rec(String s, List<List<String>>ans, List<String>temp, int n , int index){
        if(index == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index;i<n;i++){
            String sub  = s.substring(index, i+1);
          // if it is valid than move futher
            if(valid(sub)){
                temp.add(sub);
                rec(s, ans, temp, n, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean valid(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}

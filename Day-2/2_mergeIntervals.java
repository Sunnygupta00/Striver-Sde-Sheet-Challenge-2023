// here we have used a simple trick of reference 
// time : O(nlogn)
// space : O(1)

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        int pair[] = intervals[0];
        ans.add(pair);
        for(int i[] : intervals){
            if(i[0]<= pair[1]){
                pair[1] = Math.max(pair[1], i[1]);
            }else{
                pair = i;
                ans.add(pair);
            }
        }
        return ans.toArray(new int[ans.size()][]);
        
    }
}

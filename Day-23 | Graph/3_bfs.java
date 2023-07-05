//O(v+e)
//O(v+e)
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>ans = new ArrayList<>();
        ArrayDeque<Integer>q = new ArrayDeque<>();
        boolean vis[] = new boolean[V];
        ans.add(0);
        q.offer(0);
        while(q.size()>0){
            int temp = q.poll();
            for(int i: adj.get(temp)){
                if(!vis[i]){
                    q.offer(i);
                    ans.add(i);
                    vis[i] = true;
                }
            }
        }
        return ans;
    }
}

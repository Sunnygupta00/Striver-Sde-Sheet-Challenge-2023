// dfs by simple using recursion stack
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // building the graph
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];
            adj.get(pre).add(course);
        }
        boolean vis[] = new boolean[numCourses];
        boolean stack[] = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!vis[i] && dfs(adj, vis, stack, i)){
                return false;
            }
        }
        return true;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>>adj,boolean vis[], boolean stack[], int source ){
        vis[source] = true;
        stack[source] = true;
        for(int i: adj.get(source)){
            if(!vis[i]){
                if(dfs(adj, vis, stack, i)){
                    return true;
                }
            }else if(stack[i] == true){
                return true;
            }
        }
        stack[source] = false;
        return false;
    }
}

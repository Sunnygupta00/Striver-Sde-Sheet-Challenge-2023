// bfs using topo sort
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
        return bfs(adj, numCourses);
       
    }
    public boolean bfs(ArrayList<ArrayList<Integer>>adj, int size){
       // we will calculate indegree
       int indegree[] = new int[size];
       for(ArrayList<Integer>i : adj){
           for(int j : i){
               indegree[j]++;
           }
       }
       ArrayDeque<Integer>q = new ArrayDeque<>();
       for(int i=0;i<size;i++){
           if(indegree[i] == 0){
               q.offer(i);
           }
       }
       int count = 0;
       while(q.size()>0){
           count++;
           int node = q.poll();
           for(int i: adj.get(node)){
               indegree[i]--;
               if(indegree[i] == 0){
                   q.offer(i);
               }
           }
       }
       return count == size;

    }
}

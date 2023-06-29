public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Collections.sort(A, Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());
        for(int i : A){
            for(int j : B){
                int sum = i+j;
                if(pq.size()<C){
                    pq.offer(sum);
                }else if(pq.peek()<sum){
                    pq.poll();
                    pq.offer(sum);
                }else{
                    break;
                }
            }
        }
        ArrayList <Integer>ans = new ArrayList<>(pq);
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}

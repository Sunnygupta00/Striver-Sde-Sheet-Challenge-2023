import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
// brute simple add in a list and then sort it
//Time Complexity: O((N * K) * log(N * K))
//Space Complexity: O(N * K)

// optimised
// 
public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		PriorityQueue<ArrayList<Integer>>pq = new PriorityQueue<>((a,b)-> a.get(0)-b.get(0));
		ArrayList<Integer>ans = new ArrayList<>();
		for(ArrayList<Integer>i:kArrays){
			if(i.size()>0){
				pq.offer(i);
			}
		}
		while(pq.size()>0){
		     ArrayList<Integer> temp = pq.poll();
			ans.add(temp.get(0));
			temp.remove(0);
			if(temp.size()>0)pq.offer(temp);
		}
		return ans;

	}
}

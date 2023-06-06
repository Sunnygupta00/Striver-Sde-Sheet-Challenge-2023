import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long ans = 0;
		long sum = 0;
		for(int i = 0;i<n;i++){
			sum+= arr[i];
			ans = Math.max(ans, sum);
			if(sum<0){
				sum = 0;
			}
		}
		return ans;
	}

}

// first find the dip 
// swap it with just greater element 
// now reverse rest elements to sort in reverse order



import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		// Write your code here.
	    int n = arr.size();
		int index = -1;
		for(int i =n-2;i>=0;i--){
			if(arr.get(i)<arr.get(i+1)){
				index = i;
				break;
			}
		}
		if(index == -1){
			reverse(arr, 0, n-1);
			return arr;
		}
		for(int i = n-1;i>=0;i--){
			if(arr.get(i)>arr.get(index)){
				swap(arr, i, index);
				break;
			}
		}
		reverse(arr, index+1, n-1);
		return arr;
	}
	public static void reverse(ArrayList<Integer>arr, int i, int j){
		while(i<=j){
			swap(arr, i++, j--);
		}
	}
	public static void swap(ArrayList<Integer>arr, int i, int j ){
		int temp = arr.get(i);
		arr.set(i,arr.get(j));
		arr.set(j, temp);
	}
}

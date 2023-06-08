// sort + run loop : nlogn
// hashmap 
// using basic maths eqations of sum of n natural number and square of sum 
// s+ sn = x+y; (val) --> 1
// s^2 + s2n = x^2+y^2;(val2) -->2
// (x+y)(x-y) = s2 + s2n;
// x+y = s2+s2n/x-y ./ find and put in equation 1



import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int hash[] = new int[n+1];
        for(int i: arr){
            hash[i]++;
        }
        int twice = 0;
        int missing = 0;
        for(int i =1;i<n+1;i++){
            if(hash[i] == 0){
                missing = i;
            }else if(hash[i] == 2){
                twice = i;
            }
        }
        return new int[]{missing, twice};
    }
}

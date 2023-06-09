//BRUTE : 2LOOPS -> O(N*N)
// OPTIMAL : USING HASHMAP
// TIME : O(N)
// SPACE : O(N);
//BETTER : MOREMAJORITY ELEMENT : ACCORING TO THIS IF ELEMENT EXIST N/2 SO ITS FREQUENCY MUST BE THE HEIGEST :)
//Time:  O(n)
// space : O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int element = nums[0];
        for(int i=1;i<n;i++){
            if(element == nums[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                element = nums[i];
                count =1;
            }
        }
       count = 0;
       for(int i : nums){
           if(i == element)count++;
       }
       return count>=count/n ? element : -1;
        
    }
}

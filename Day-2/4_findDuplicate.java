//brute use sorting : nlogn
// better : use map
// optimised : use tortoise technique

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return nums[i];
            }
            hm.put(nums[i],i);
        }
        return 0;
      
    }
}
// tortoise method
class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];
       do{
           slow = nums[slow];
           fast = nums[nums[fast]];
       }while(fast!=slow);
       slow = nums[0];
       while(slow!=fast){
           slow = nums[slow];
           fast = nums[fast];
       }
       return fast;
      
    }
    
}

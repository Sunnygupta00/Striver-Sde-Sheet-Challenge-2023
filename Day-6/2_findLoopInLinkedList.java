// Brute force : O(n)+O(n)
// simple using hashSet
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        for(ListNode curr = head;curr!=null;curr=curr.next){
            if(hs.contains(curr)){
                return true;
            }
            hs.add(curr);
        }
        return false;
        
    }
}



// O(n)
// O(1)
// simple using slow & Fast pointer
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
        
    }
}

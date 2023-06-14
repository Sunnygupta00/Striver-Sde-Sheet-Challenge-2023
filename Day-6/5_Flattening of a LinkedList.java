// Brute Force : simple using haset
// Time : O(n)+O(n)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null )return null;
        HashSet<ListNode> hs = new HashSet<>();
        for(ListNode curr = head; curr!=null; curr = curr.next){
            if(hs.contains(curr)){
                return curr;
            }
            hs.add(curr);
        }
        return null;
        
    }
}

// optimised : using two pointer 1) detect cycle and then move head and inter together
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null )return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode interSect = null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                interSect = slow;
                break;
            }

        }
        if(interSect == null)return null;
        slow = head;
        while(slow != interSect){
            slow = slow.next;
            interSect = interSect.next;
        }
        return interSect;
        
    }
}

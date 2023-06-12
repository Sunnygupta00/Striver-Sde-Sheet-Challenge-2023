// two iterations
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)return head;
        int count = 0;
        for(ListNode curr = head; curr!=null;curr= curr.next){
            count++;
        }
        if(n == count){
            return head.next;
        }
        int length = count-n;
        ListNode curr = head;
        for(int i =1;i<length;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;        
    }
}
// Single Iterations

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)return head;
        ListNode dummy = new ListNode (-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i = 0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;       
    }
}

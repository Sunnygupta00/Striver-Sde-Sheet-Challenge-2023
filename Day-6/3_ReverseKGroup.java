// recursive approach 

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1)return head;
        ListNode start = head;
        ListNode end = head;
        for(int count = 1;count<k && end!=null; count++){
            end = end.next;
        }
        if(end == null)return head;
        ListNode newHead = reverseKGroup(end.next, k);
        // reversing 
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null && prev!=end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start.next = newHead;
        return prev;
    }
}

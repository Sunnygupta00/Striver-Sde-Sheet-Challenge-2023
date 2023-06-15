// Brute Force -
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next == null)return head;
        int count = 0;
        for(ListNode curr = head; curr!=null; curr = curr.next, count++){}
        k%=count;
        if(k == 0)return head;
        int length = count-k-1;
        ListNode startFirst = head;
        ListNode endFirst = head;
        ListNode endLast = head;
        count = 1;
        for(ListNode curr = head; curr!=null; curr = curr.next, count++){
            if(count == length){
                endFirst = curr.next;
            }
            endLast = curr;
        }
        ListNode startLast = endFirst.next;
        endFirst.next = null;
        partialReverse(startFirst, endFirst);
        partialReverse(startLast, endLast);
        startFirst.next = endLast;
        partialReverse(endFirst, startLast);
        return startLast;
    }
    public void partialReverse(ListNode start, ListNode end){
        ListNode curr = start;
        ListNode prev = null;
        while(curr != null && prev!=end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

    }
}

// iterative 

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next = null, prev = null, curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
}

// Recursive

class Solution {
    public ListNode reverseList(ListNode head) {
       if(head == null || head.next == null)return head;
       ListNode newHead = reverseList(head.next);
       head.next.next = head;
       head.next = null;
       return newHead;
    }
}

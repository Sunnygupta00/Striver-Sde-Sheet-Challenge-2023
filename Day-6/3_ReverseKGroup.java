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
// without space 
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1)return head;
        ListNode dummy = new ListNode (-1);
        dummy.next = head;
        ListNode end = head;
        ListNode prevHead = dummy;
        int i =1;
        while(end !=null){
            if(i%k == 0){
                ListNode start = prevHead.next;
                ListNode nextStart = end.next;
                reverse(start, end);
                start.next = nextStart;
                prevHead.next = end;
                prevHead = start;
                end = nextStart;
                
            }else{
                end = end.next;
            }
             i++;
        }
        return dummy.next;
        
    }
    public  void reverse(ListNode start, ListNode end){
        ListNode prev = null;
        ListNode curr = start;
        while(start!=null && prev!=end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}

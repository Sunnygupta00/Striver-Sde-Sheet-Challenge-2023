// Brute force using stack
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayDeque<ListNode> stack = new ArrayDeque<>();
        for(ListNode curr = head; curr!=null;curr = curr.next){
            stack.push(curr);
        }
        for(ListNode curr = head;curr!=null;curr = curr.next){
            if(curr.val != stack.pop().val)return false;
        }
        return true;
    }
}

//---------------------------------------------------------------------------------------
// optimised
// optimised logn  + O(1)
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        fast = head;
        while(prev !=null){
            if(fast.val != prev.val)return false;
            fast = fast.next;
            prev = prev.next;
        }
        return true;
    }
}



// simple implementation one thing to remember that number is reversed, if number is not reversed reverse it

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode one = l1;
        ListNode two = l2;
        ListNode ans = new ListNode(-1);
        ListNode ptr = ans;

        while(one !=null || two!=null || carry !=0 ){
            int a = one == null? 0 : one.val;
            int b = two == null? 0 : two.val;
            int sum = a+b+carry;
            int curr = sum%10;
            carry = sum/10;
            ptr.next = new ListNode(curr);
            ptr = ptr.next;
            if(one!=null){
                one = one.next;
            }
            if(two !=null){
                two = two.next;
            }
        }
        return ans.next;
        
    }
}

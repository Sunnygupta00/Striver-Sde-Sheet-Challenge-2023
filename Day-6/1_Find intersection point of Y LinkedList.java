// Brute force : O(n)+O(n) --> simple using hasSet
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        HashSet<ListNode> hs = new HashSet<>();
        for(ListNode curr = headA; curr!=null;curr = curr.next){
            hs.add(curr);
        }
        for(ListNode curr = headB; curr!=null;curr = curr.next){
            if(hs.contains(curr))return curr;
        }
        return null;
    }
}
// better :  Two Iterations

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        int countA = 0;
        int countB = 0;
        for(ListNode curr = headA; curr!=null;curr = curr.next, countA++){ }
        for(ListNode curr = headB; curr!=null;curr = curr.next,countB++){ }
        int dif = Math.abs(countA-countB);
        ListNode a = headA;
        ListNode b = headB;
        if(countA> countB){
            while(dif-->0){
                a = a.next;
            }
        }else if(countB>countA){
            while(dif-->0){
                b=b.next;
            }
        }
        while(a!=b){
            a=a.next;
            b = b.next;
        }
        return a;
    }
}

// optimised
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = a == null ? headA : a.next;
            b = b == null? headB : b.next;
        }
        return a;        
    }
}

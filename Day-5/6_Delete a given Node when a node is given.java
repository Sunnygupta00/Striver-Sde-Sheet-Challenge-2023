// simple swap with its adjacent element
// time : O(1)

class Solution {
    public void deleteNode(ListNode node) {
        // hence we don't have last and first
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

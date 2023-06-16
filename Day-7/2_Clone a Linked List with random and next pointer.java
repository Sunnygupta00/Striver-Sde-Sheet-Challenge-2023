// BruteForce : we will first Create newReferece of same same node and then just share the next and random
// time : O(n)+O(n)
class Solution {
    public Node copyRandomList(Node head) {
       if(head == null)return head;
       HashMap<Node, Node> hm = new HashMap<>();
       for(Node curr = head; curr!=null;curr = curr.next){
           hm.put(curr, new Node(curr.val));
       }
       for(Node curr = head;curr!=null;curr=curr.next){
           hm.get(curr).next = hm.get(curr.next);
           hm.get(curr).random = hm.get(curr.random);
       }
       return hm.get(head);
        
    }
}
// Optimised we will insert the node in between

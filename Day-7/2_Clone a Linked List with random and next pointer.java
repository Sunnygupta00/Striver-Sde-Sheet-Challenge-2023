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



class Solution {
    public Node copyRandomList(Node head) {
        
       //Base case 
        if(head==null) return head;
//---------------------------------------------------------------------------------
      // Inserting the the clone in b/w so that we can easily copy original
        for(Node curr=head; curr!=null; curr=curr.next.next){
   
            Node temp=curr.next; // holding curr next
            Node clone=new Node (curr.val);// created clone;
            curr.next=clone;// adding clone
            clone.next=temp;//conecting with original
   
        }
//---------------------------------------------------------------------------------        
        
        // NOW JUST COPYING THE RANDOM POINTERS
        for(Node curr=head; curr!=null; curr=curr.next.next){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
        }  
//---------------------------------------------------------------------------------   
        // NOW WE ARE SEPRATING BOTH ORGINAL AND CLONE ONE
        Node dummy =new Node(-1);// we will attack the clone one with this
        Node temp=dummy;//pointer for dummy
        
        for(Node curr=head; curr!=null; curr=curr.next){
            temp.next=curr.next;// CONNECTING TEMP WITH CLONE ONE
            temp=temp.next;    // NOW MOVING AHEAD POINTER
            curr.next=temp.next;// ALSO CONNECTIN THE ORIGINAL POINTER
        }
        
//---------------------------------------------------------------------------------
        return dummy.next;// AS DUMMY IS -1 WE WILL RETURN DUMMY.NEXT
    }
}  

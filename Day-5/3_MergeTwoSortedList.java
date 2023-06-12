// Using Recursion
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

// Iterative

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode tempHead = new ListNode(-1);
        ListNode ptr  = tempHead;
        while(list1 !=null && list2!=null){
            if(list1.val < list2.val){
                ptr.next = list1;
                list1 = list1.next;
            }else{
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }
        if(list1 == null){
            ptr.next = list2;
        }else{
            ptr.next = list1;
        }
        return tempHead.next;
    }
}

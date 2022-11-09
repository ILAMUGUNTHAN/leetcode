/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next; 
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode dum1=headA,dum2=headB;
        while(dum1!=dum2){
            if(dum1==null) dum1=headB;
            else dum1=dum1.next;
            
            if(dum2==null) dum2=headA;
            else dum2=dum2.next;
        }
        return dum2;
        
    }
}
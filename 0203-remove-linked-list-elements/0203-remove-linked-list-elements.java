/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode dum=head;
        
        while(dum.next!=null ){
            if(dum.next.val==val){
                dum.next=dum.next.next;
            }
            else dum=dum.next;
        }
        return head.val==val?head.next:head;
    }
}
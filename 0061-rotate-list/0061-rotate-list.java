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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null|| k==0) return head;
        ListNode dum=head;
        int len=1;
        
        while(dum.next!=null){
            len++;
            dum=dum.next;
        }
        dum.next=head;
        k=k%len;
        k=len-k;
        while(k-->0) dum=dum.next;
        head=dum.next;
        dum.next=null;
        return head;
    }
}
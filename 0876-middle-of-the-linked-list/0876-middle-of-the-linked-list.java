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
    public ListNode middleNode(ListNode head) {
        /*int size=0;
        ListNode dum=head;
        while(dum!=null){
            size++;
            dum=dum.next;
        }
        int ctr=-1;
        while(head!=null){
            ctr++;
            if(ctr==size/2){
                return head;
            }else{
                head=head.next;
            }
        }
        System.out.print(size);
        return head;*/
        ListNode fast=head;
        ListNode slow=head;
        while( fast!=null &&fast.next!=null  ){
            
            slow=slow.next;

            fast=fast.next.next;
        }
        return slow;
    }
}
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode l=head,s=head;
        int siz=1;
        while(l.next!=null){
            siz++;
            l=l.next;
            
        }
        int i=1;
        int del=siz-n;
        if(del==0){
            head=head.next;
            return head;
        }
        while(s.next!=null){
            if(i==del){
                s.next=s.next.next;
                break;
            }else{
                s=s.next;
                i++;
            }
        }
        
    
        return head;
    }
}
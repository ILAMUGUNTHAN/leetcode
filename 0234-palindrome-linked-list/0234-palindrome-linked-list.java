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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        
        ListNode f=head,s=head;
        
        while(f.next!=null&& f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        s.next=rev(s.next);
        s=s.next;
        while(s!=null){
            if(head.val!=s.val) return false;
            head=head.next;
            s=s.next;
        }
        return true;
    }
    ListNode rev(ListNode head){
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
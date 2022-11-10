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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode();
        ListNode tem=dum;
        int car=0;
        while(l1!=null || l2!=null ||car==1){
            int s=0;
            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
            s+=car;
            car=s/10;
            ListNode node=new ListNode(s%10);
            tem.next=node;
            tem=tem.next;
        }
        
        return dum.next;
    }
}
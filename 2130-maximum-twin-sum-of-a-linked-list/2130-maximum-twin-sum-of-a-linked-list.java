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
    public int pairSum(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode dum=head;
        while(dum!=null){
            stack.push(dum);
            dum=dum.next;
        }
        int ans=0;
        while(stack.size()>stack.size()/2){
            ans=Math.max(ans,(head.val+stack.pop().val));
            head=head.next;
            
        }
        return ans;
    }
}
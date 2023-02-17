/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int MIN=Integer.MAX_VALUE;
    Integer p=null;
    public int minDiffInBST(TreeNode root) {
        helper(root);
        
        return MIN;
    }
    public void helper(TreeNode root){
        if(root==null) return ;
        helper(root.left);
        if(p!=null) MIN=Math.min(MIN,root.val-p);
        p=root.val;
        helper(root.right);
        
        
        
        
        /*if(root==null)return;
        
        int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
        if(root.left!=null){
            left=Math.abs(root.val-root.left.val);
            if(MIN>left){
                MIN=left;
            }
        }
        if(root.right!=null){
            right=Math.abs(root.val-root.right.val);
            if(MIN>right){
                MIN=right;
            }
        }
        helper(root.left);
        helper(root.right);
        return ;*/
    }
}
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
    int min=Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        get_min(root);
        return min;
        
    }
    public void get_min(TreeNode root){
        if(root== null) return ;
        get_min(root.left);
        if(prev!=null) min=Math.min(min,root.val-prev.val);
        prev= root;
        get_min(root.right);
        
    }
    
}
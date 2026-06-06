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

    int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;

        maxPathSumDFS(root);

        return maxSum;
    }

    public int maxPathSumDFS(TreeNode node){

        if(node == null) return 0;

        int lft = Math.max(0, maxPathSumDFS(node.left));
        int right = Math.max(0, maxPathSumDFS(node.right));

        int currPathSum = node.val + lft+right;

        maxSum = Math.max(maxSum, currPathSum);

        return node.val + Math.max(lft, right);
    }
}

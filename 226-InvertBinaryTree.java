/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return null;
        queue.add(root);
        while(!queue.isEmpty()){
          TreeNode node = queue.poll();
          TreeNode left = node.left;
          node.left = node.right;
          node.right = left;
          if(node.left!=null) queue.add(node.left);
          if(node.right!=null) queue.add(node.right);
        }
        return root;
    }
}

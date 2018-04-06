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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return treeBuilder(preorder, inorder, 0, 0, inorder.length-1);
    }
    
    private TreeNode treeBuilder(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd){
        if(preStart > preorder.length-1 || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == preorder[preStart]) {
                index = i;
                break;
            }
        }
        root.left = treeBuilder(preorder, inorder, preStart + 1, inStart, index-1);
        root.right = treeBuilder(preorder, inorder, preStart + index - inStart +1 ,index+1, inEnd);
        return root;
    }
}

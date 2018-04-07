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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildHelper(inorder, postorder, postorder.length-1, 0, inorder.length-1);
    }
    
    private TreeNode buildHelper(int[] inorder, int[] postorder, int postEnd, int inStart, int inEnd){
        if(inStart > inEnd || postEnd < 0) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
          if(inorder[i] == postorder[postEnd]){
            index = i;
            break;
          }
        }
        root.left = buildHelper(inorder, postorder, postEnd - (inEnd-index) - 1 ,inStart, index-1);
        root.right = buildHelper(inorder, postorder,postEnd -1,index+1, inEnd);
        return root;
    }
}

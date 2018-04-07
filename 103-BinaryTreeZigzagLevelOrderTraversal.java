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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reversed = false;
        while(!queue.isEmpty()){
          List<Integer> subList = new LinkedList<>();
          int size = queue.size();
          for(int i = 0; i < size; i++){
            TreeNode node = queue.poll();
            if(reversed){
              subList.add(0, node.val);
            }else{
              subList.add(node.val);
            }
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
          }
          result.add(subList);
          if(reversed){
            reversed = false;
          }else{
            reversed = true;
          }
        }
        return result;
    }
}

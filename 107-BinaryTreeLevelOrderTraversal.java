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
   //BFS
    public List<List<Integer>> levelOrderBottomBFS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
          List<Integer> list = new ArrayList<>();
          int size = queue.size();
          for(int i = 0; i < size; i ++){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
          }
          result.add(0,list);
        }
        return result;
    }
    //DFS
     public List<List<Integer>> levelOrderBottomDFS(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        DFS(root, result, 0);
        return result;
     }
     
     public void DFS(TreeNode root, List<List<Integer>> result, int level){
        if(root == null) return null;
        if(level > result.size()) result.add(0, new LinkedList<Integer>());
        DFS(root.left, result, level+1);
        DFS(root.right, result, level+1);
        list.get(list.size()-level-1).add(root.val);
       
     }
}

//Given a Binary Search Tree and a target number, 
//return true if there exist two elements in the BST such that their sum is equal to the given target.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DFS {
    private Set<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<Integer>();
        return dfs(root, k);
    }
    public boolean dfs(TreeNode root, int k){
        if(root == null) return false;
        if(set.contains(k-root.val)) return true;
        
        set.add(root.val);
        return dfs(root.left, k) || dfs(root.right, k);
    }    
}

class InOrderTraversal{
    List<Integer> list;
    public boolean findTarget(TreeNode root, int k) {
        list = new ArrayList<Integer>();
        inOrderTraversal(root);
        int start = 0;
        int end = list.size()-1;
        while(start < end){
            if(list.get(start) + list.get(end) == k) return true;
            if(list.get(start) + list.get(end) < k) {
                start++;
            }else{
                end--;
            }
            
        }
        return false;
    }
    
    public void inOrderTraversal(TreeNode root){
        if(root == null) return;
        inOrderTraversal(root.left);
        list.add(root.val);
        inOrderTraversal(root.right);
    }
}


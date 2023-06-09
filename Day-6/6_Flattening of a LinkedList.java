// bruteForce
class Solution {
    public void flatten(TreeNode root) {
        List<TreeNode> temp = new ArrayList<>();
        rec(root, temp);
        
        TreeNode ptr = root;
        for(int i = 1;i<temp.size();i++){
            ptr.right = temp.get(i);
            ptr.left = null;
            ptr = ptr.right;
        }
        
    }
    public void rec(TreeNode root, List<TreeNode>temp){
        if(root == null)return;
        temp.add(root);
        rec(root.left, temp);
        rec(root.right, temp);
    }
}
//optimised

class Solution {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
      if(root == null)return;
       flatten(root.right);
       flatten(root.left);
       root.right = prev;
       root.left = null;
       prev = root;
    }
}

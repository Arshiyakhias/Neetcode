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
    public void inorder(List<Integer>lis,TreeNode root){
        if(root==null){
            lis.add(null);
            return;
        }
        inorder(lis,root.left);
        lis.add(root.val);
        inorder(lis,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer>first=new ArrayList<>();
        ArrayList<Integer>second=new ArrayList<>();
        inorder(first,p);
        inorder(second,q);
        for(int i=0;i<first.size();i++){
            if(first.get(i)!=second.get(i)){
                return false;
            }
        }
        return true;

        
    }
}

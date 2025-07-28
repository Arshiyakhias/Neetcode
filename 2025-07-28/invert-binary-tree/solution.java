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
    private void inorder(List<Integer>lis,TreeNode root){
        if(root==null){
            lis.add(null);
            return;
        }
        inorder(lis,root.left);
        lis.add(root.val);
        inorder(lis,root.right);


    }
    
    private void invert(List<Integer>inverted,TreeNode root,int count){
        if(root==null){

            return;
        }
        inorder(inverted,root.left);
        root.val=inverted.get(count);
        count++;
        inorder(inverted,root.right);


    }
    public TreeNode invertTree(TreeNode root) {
        List<Integer>lis=new ArrayList<>();
        inorder(lis,root);
        List<Integer>inverted=new ArrayList<>();
        for(int i=lis.size()-1;i>=0;i--){
            inverted.add(lis.get(i));
        }
        int count=0;
        invert(inverted,root,count);
        return root;

        
        
    }
}

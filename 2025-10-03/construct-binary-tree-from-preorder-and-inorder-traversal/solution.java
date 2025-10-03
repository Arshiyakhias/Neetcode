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
    int index=0;
    private int poscal(int[]inorder,int vals){
        for(int i=0;i<inorder.length;i++){
            if(vals==inorder[i]){
                return i;
            }
        }
        return -1;
    }

    private TreeNode solve(int[]preorder,int[]inorder,int inorderStart,int inorderEnd){
        if(inorderStart>inorderEnd || index>preorder.length){
            return null;
        }

        TreeNode ans=new TreeNode(preorder[index]);
        index++;
        int pos=poscal(inorder,addon.val);
        ans.left=solve(preorder,inorder,0,pos-1);
        ans.right=solve(preorder,inorder,pos+1,inorder.length-1);
        return ans;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode ans=solve(preorder,inorder,0,inorder.length-1);
        return ans;
        
    }
}

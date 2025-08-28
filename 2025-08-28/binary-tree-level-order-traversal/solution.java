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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>lis=new ArrayList<>();
        if(root==null){
            return lis;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int vals=q.size();
            List<Integer>addon=new ArrayList<>();
            while(vals!=0){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
               if(curr.right!=null){
                    q.add(curr.right);
                }
               
                addon.add(curr.val);



                vals--;
            }
            lis.add(addon);
        }
        return lis;
        
    }
}

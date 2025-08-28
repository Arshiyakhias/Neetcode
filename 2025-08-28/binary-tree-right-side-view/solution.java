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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer>ans=new ArrayList<>();
        List<List<Integer>>lis=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer>addon=new ArrayList<>();

            int vals=q.size();
            while(vals!=0){
                TreeNode check=q.poll();
                if(check.left!=null){
                    q.add(check.left);

                }
                if(check.right!=null){
                    q.add(check.right);

                }
                addon.add(check.val);
                vals--;
            }
            lis.add(addon);

        }

        for(List<Integer>sing:lis){
            ans.add(sing.get(sing.size()-1));
        }
        return ans;
    }
}

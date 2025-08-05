class Solution {
    public int rob(int[] nums) {
        int[]ans;
        ans=new int[nums.length];
        ans[0]=nums[0];
        ans[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            ans[i]=Math.max(ans[i-1],nums[i]+nums[i-2]);
        }
        return ans[ans.length-1];
    }
}

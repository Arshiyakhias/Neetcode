class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]ans;
        ans=new int[cost.length];
        if(cost.length==1){
            return cost[0];
        }
        if(cost.length==2){
            if(cost[0]>cost[1]){
                return cost[1];
            }
            else{
                return cost[0];
            }
        }
        ans[0]=cost[0];
        ans[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            ans[i]=ans[i-1]+cost[i];

        }
        if(ans[ans.length-1]>ans[ans.length-2]){
            return ans[ans.length-2];
        }
        return ans[ans.length-1];


    }
}

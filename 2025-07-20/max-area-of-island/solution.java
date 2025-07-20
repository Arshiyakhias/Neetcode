class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_are=0;
       for(int i=0;i,grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){

                int val=dfs(grid,i,j);
                max_are=Math.max(max_are,val);
                
            }
        }
       }

       return max_are; 
    }

    public int dfs(int[][]grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid.length || grid[i][j]==0){
            return 0;
        }
        int current = grid[i][j];
        grid[i][j]=0;
        int sum=sum+current;
        sum=sum+dfs(grid,i+1,j);
        sum=sum+dfs(grid,i+1,j);

    }
}

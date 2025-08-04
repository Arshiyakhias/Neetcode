class Solution {
    public int[][] merge(int[][] intervals) {
        //Arrays.sort(intervals);
        List<List<Integer>>lis=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][1]>=intervals[i+1][0] ){
                
                if(i+1==intervals.length){
                   ArrayList<Integer>addon=new ArrayList<>();
                addon.add(intervals[i][0]);
                addon.add(intervals[i+1][1]);
                if(!lis.contains(addon)){
                    lis.add(addon);

                } 
                break;
                }
                else{
                    ArrayList<Integer>addon=new ArrayList<>();
                addon.add(intervals[i][0]);
                addon.add(intervals[i+1][1]);
                if(!lis.contains(addon)){
                    lis.add(addon);

                }
                }
                


            }
            
            else{
                ArrayList<Integer>addon=new ArrayList<>();
                addon.add(intervals[i][0]);
                addon.add(intervals[i][1]);
                if(!lis.contains(addon)){
                    lis.add(addon);

                }
            }
        }
        int[][]ans;
        ans=new int[lis.size()][2];
        for(int i=0;i<ans.length;i++){
            ans[i][0]=lis.get(i).get(0);
            ans[i][1]=lis.get(i).get(1);
        }
        return ans;
    }
}

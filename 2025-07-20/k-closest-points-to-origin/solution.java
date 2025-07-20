class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<List<Integer>>lis=new ArrayList<>();
        for(int[]arr:points){
            ArayList<Integer>addon=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                addon.add(arr[i]);
            }
            lis.add(addon);
        }

        Collectios.sort(lis,(a,b)->
        Integer.compare(a[0]*a[0]+a[1]*a[1],b[0]*b[0]+b[1]*b[1])
        );
        int[][]ans;
        ans=new int[2][2];
        for(int i=0;i<k;i++){
            ans[i]=lis.get(i);
        }
        return ans;


    }
}

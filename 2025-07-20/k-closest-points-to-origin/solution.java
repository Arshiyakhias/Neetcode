class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<List<Integer>>lis=new ArrayList<>();
        for(int[]arr:points){
            List<Integer>addon=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                addon.add(arr[i]);
            }
            lis.add(addon);
        }

        Collections.sort(lis,(a,b)->
        Integer.compare(a.get(0)*a.get(0)+a.get(1)*a.get(1),b.get(0)*b.get(0)+b.get(1)*b.get(1))
        );
        int[][]ans;
        ans=new int[2][2];
        for(int i=0;i<k;i++){
            ans[i][i]=lis.get(i);
        }
        return ans;


    }
}

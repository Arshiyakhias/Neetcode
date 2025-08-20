class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        HashSet<Integer>set=new HashSet<>();
        for(int[]interval:intervals){
            if(set.contains(interval[0]) && set.contains(interval[1])){
                count++;
            }
            else{
                for(int i=interval[0];i<=interval[1];i++){
                    set.add(i);
                }
            }
        }
        return count;
    }
}

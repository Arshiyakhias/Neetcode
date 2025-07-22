class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                continue;
            }
            else{
                int count=0;
                int num=nums[i];
                while(set.contains(num+1)){
                    num++;
                    count++;


                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}

/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        HashSet<Integer>set=new HashSet<>();
        for(List<Integer>lis:intervals){
            for(int i=lis.get(0);i<=lis.get(1);i++){
                if(set.contains(lis.get(i))){
                    return false;
                }
                else{
                    set.add(lis.get(i));
                }

            }
        }
        return true;

    }
}

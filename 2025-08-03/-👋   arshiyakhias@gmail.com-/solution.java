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
        for(Interval interval:intervals){
            for(int i=interval.start;i<interval.end;i++){
                if(set.contains(i)){
                    return false;
                }
                else{
                    set.add(i);
                }

            }
        }
        return true;

    }
}

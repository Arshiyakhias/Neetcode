/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer>lis=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            lis.add(curr.val);
        }
        int left=0;
        int right=lis.size()-1;
        ListNode curr1=head;

        while(left<right){
            curr1.val=lis.get(left);
            left++;
            curr1=curr1.next;
            curr1.val=lis.get(right);
            right--;
            
        }
        
    }
}

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = new ListNode(-1,head);
        int i=0;
        ListNode t= temp,prev=null;

        while(i<left){
            i++;
            prev =t;
            t = t.next;
        }
       
        ListNode p= null;
        ListNode in = t;
        while(i<=right && i>=left){
          ListNode temp1 = t.next ;
          t.next = p;
          p =t;
          t = temp1;
          i++;
        }
        if(prev!=null)
        prev.next = p;
        if(in!=null)
        in.next = t;
        return temp.next;    
        }
    
}
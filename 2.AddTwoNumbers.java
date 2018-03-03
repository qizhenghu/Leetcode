/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int carry = 0;
        while(l1!=null || l2!=null){
          int sum = carry;
          if(l1!=null){
            sum += l1.val;
          }
          if(l2!=null){
            sum+= l2.val;
          }
          if (sum > 10) {
            carry = 1;
            sum = sum%10;
          }else{
            carry = 0;
          }
          head.next = new ListNode(sum);
          head = head.next;
        }
        if(carry == 1){
          head.next = new ListNode(carry);
        }
        return head;
    }
}

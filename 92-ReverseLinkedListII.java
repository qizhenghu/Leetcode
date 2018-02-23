/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i < m-1; i++) pre = pre.next;
        ListNode start = pre.next;
        ListNode current = start.next;
        for(int i = m; i < n; i++){
          start.next = current.next;
          current.next = pre.next;
          pre.next = current;
          current = start.next;
        }
        
        return dummy.next;
    }
}

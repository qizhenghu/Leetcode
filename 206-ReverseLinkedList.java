 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class InPlace {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while(head!=null){
          ListNode next = head.next;
          head.next = previous;
          previous = head;
          head = next;
        }
       return previous;
    }
}
class Recursive{
    public ListNode reverseList(ListNode head) {
        return reverseSubList(head,null);
    }
    public ListNode reverseSubList(ListNode current, ListNode previous){
      if(current == null) return previous;
      ListNode next = current.next;
      current.next = previous;      
      return reverseSubList(next, current);
    }
}

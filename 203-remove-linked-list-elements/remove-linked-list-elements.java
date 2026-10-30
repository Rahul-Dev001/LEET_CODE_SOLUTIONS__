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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode current = head;

        while(current != null){
            
            if(current.val == val){
                if(current == head){
                    prev.next = head.next;
                    head = head.next;
                    current = current.next;
                }
                else{
                    prev.next = current.next;
                    current = current.next;
                }
            }
            else{
            prev = prev.next;
            current = current.next;
            }
        }
        return head;
    }
}
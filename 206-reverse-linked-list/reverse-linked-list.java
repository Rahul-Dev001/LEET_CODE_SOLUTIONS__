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

//reversing the linked list by keeping the pointer direction same 
// hw reverse the linked list by reversing the direction of pointers onnly

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null )
        return head;
        
        ListNode tail = head;
        ListNode temp = tail.next;

        while(tail.next != null){
            tail.next = temp.next;
            temp.next = head;
            head = temp;
            temp = tail.next;

        }
        return head;
    }
}
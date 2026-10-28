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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode front = null;
        // ListNode back = null;
        ListNode temp = dummy;
        boolean flag = false;
        if(head == null || head.next == null){
            return dummy.next;
        }

        while(temp != null){

            if(temp.next != null && temp.next.next != null && front == null && temp.next.val == temp.next.next.val ){
                front = temp;
                flag = true;
            }
            else if(flag &&(temp.next == null || temp.val != temp.next.val)){
                // temp = temp.next;
                front.next = temp.next;
                temp = front;
                front = null;
                flag = false;
                continue;
            }
            temp = temp.next;
        }

        return dummy.next;
        
    }
}
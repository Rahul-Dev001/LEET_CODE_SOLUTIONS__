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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null && n == 1){
            return null;
        }
        // if(head.next.next == null){
        //     return head.next;
        // }
        ListNode current = head;
        

        int count = 0;

        while(current != null){
            count++;
            current = current.next;
        }
        if(count == n){
            return head.next;
        }
        
        current = head;
        for(int i = 1 ; i <= count - n-1 ; i++ ){
            current = current.next;
        }
        // if(current == null){
        //     return head.next;
        // }
        if(current.next.next != null){
        current.next = current.next.next;
        }
        else{
            current.next = null;
        }

        return head;


        
    }
}
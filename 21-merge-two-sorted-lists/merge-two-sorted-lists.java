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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //bad way to copy the value and create on chain cuz it leaves a preceeding or leding zero

        // ListNode l3 = new ListNode();
        // ListNode dummy = l3;

        // while(list1 != null && list2 != null ){
        //     if(list1.val <= list2.val){
        //         dummy.val = list1.val;
        //         dummy.next = new ListNode() ;
        //         list1 = list1.next;
        //         dummy = dummy.next;

        //     }
        //     else{
        //         dummy.val = list2.val;
        //         dummy.next = new ListNode() ;
        //         list2 = list2.next;
        //         dummy = dummy.next;
        //     }
        // }
        // while(list1 != null){
        //     dummy.val = list1.val;
        //     dummy.next = new ListNode() ;
        //     list1 = list1.next;
        //     dummy = dummy.next;
        // }
        // while(list2 != null){
        //     dummy.val = list2.val;
        //     dummy.next = new ListNode() ;
        //     list2 = list2.next;
        //     dummy = dummy.next;
        // }
        // dummy = null;
        // return l3;

        ListNode dummy = new ListNode(0); // A placeholder start node
        ListNode current = dummy;          // Moves forward to link nodes

        // Main matching loop
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;  // Link list1 node directly
                list1 = list1.next;    // Advance list1
            } else {
                current.next = list2;  // Link list2 node directly
                list2 = list2.next;    // Advance list2
            }
            current = current.next;    // Advance our tracking pointer
        }

        // Fast cleanup: link the entire remaining chain in 1 step
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the actual head (skipping the placeholder dummy)
        return dummy.next;
    }
}
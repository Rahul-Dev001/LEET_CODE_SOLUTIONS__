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
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head.next;
        ListNode prev = head;

        while(current != null){
            if(current.val == prev.val ){
                // if(current.next != null){     <--- all these conditions are not required
                    current = current.next;
                    prev.next = current;
                // }else{
                    
                //     prev.next = null;

                //     current = null;
                // }
            
            }
            else{
                prev = prev.next;
                current = current.next;
            }
            
        }

        return head;
    
    }
}



// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head == null || head.next == null){
//             return head;
//         }
//         ListNode current = head.next;
//         ListNode prev = head;

//         while(current != null){
//             if(current.val == prev.val ){
//                 // if(current.next != null){     <--- all these conditions are not required
//                     current = current.next;
//                     prev.next = current;
//                 // }else{
                    
//                 //     prev.next = null;

//                 //     current = null;
//                 // }
            
//             }
//             else{
//                 prev = prev.next;
//                 current = current.next;
//             }
            
//         }

//         return head;
    
//     }
// }
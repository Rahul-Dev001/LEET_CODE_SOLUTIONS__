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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Iterator <String> iterator1 = l1.iterator();
        // Iterator <String> iterator2 = l2.iterator();
        ListNode l3 = new ListNode();
        ListNode dummy = l3;

        int carry = 0;

        while(l1 != null && l2 != null){
            dummy.next = new ListNode();
            dummy = dummy.next ; 
            dummy.val = (l1.val + l2.val + carry)%10 ;
            carry = (l1.val + l2.val + carry)/10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null ){
            dummy.next = new ListNode();
            dummy = dummy.next ; 
            dummy.val = (l1.val + carry)%10 ;
            carry = (l1.val + carry)/10;
            l1 = l1.next;
        }
        while(l2 != null){
            dummy.next = new ListNode();
            dummy = dummy.next ; 
            dummy.val = (l2.val + carry)%10 ;
            carry = (l2.val + carry)/10;
            l2 = l2.next;
            
        }
        if(carry == 0){
            return l3.next ;
        }
        else{
            dummy.next = new ListNode(carry);
            return l3.next ;
        }

    }
}
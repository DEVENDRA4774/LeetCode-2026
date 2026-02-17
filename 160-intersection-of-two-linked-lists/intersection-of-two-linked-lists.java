/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Boundary check
        if (headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        // Loop until they collide or both become null
        while (a != b) {
            // If pointer a reaches the end, switch to headB
            // Otherwise, move to next node
            a = (a == null) ? headB : a.next;
            
            // If pointer b reaches the end, switch to headA
            // Otherwise, move to next node
            b = (b == null) ? headA : b.next;
        }
        
        // Return either the intersection node or null
        return a;
    }
}
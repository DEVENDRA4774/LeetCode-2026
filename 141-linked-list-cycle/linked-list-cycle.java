/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Edge case: Empty list or single node cannot have a cycle
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move 1 step
            fast = fast.next.next;  // Move 2 steps
            
            // If they collide, there is a cycle
            if (slow == fast) {
                return true;
            }
        }
        
        // If fast reaches null, there is no cycle
        return false;
    }
}
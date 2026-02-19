/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Start the recursive building process with the full array bounds
        return buildBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildBST(int[] nums, int left, int right) {
        // Base case: if the left index passes the right index, there are no elements left
        if (left > right) {
            return null;
        }
        
        // Find the middle element (avoids integer overflow compared to (left + right) / 2)
        int mid = left + (right - left) / 2;
        
        // Create a new node with the middle element
        TreeNode root = new TreeNode(nums[mid]);
        
        // Recursively build the left and right subtrees
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        
        return root;
    }
}
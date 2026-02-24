class Solution:
    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
        
        def traverse(node, current_sum):
            if not node:
                return 0
            
            # Binary shift: each level down moves the existing bits left 
            # and adds the new node value (e.g., 101 becomes 1010 + 1 = 1011)
            current_sum = (current_sum << 1) | node.val
            
            # If we've reached a leaf, return the calculated path value
            if not node.left and not node.right:
                return current_sum
            
            # Otherwise, keep exploring the branches
            return traverse(node.left, current_sum) + traverse(node.right, current_sum)

        return traverse(root, 0)
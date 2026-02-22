
class Solution:
    def hasPathSum(self, root, targetSum):
        # Base Case: If the tree is empty, there are no paths
        if not root:
            return False
        
        # Check if we are at a leaf node (no children)
        if not root.left and not root.right:
            # If the current node's value equals our remaining sum, path found!
            return targetSum == root.val
        
        # Recursively check left and right subtrees
        # Subtract the current node's value from targetSum for the next level
        new_target = targetSum - root.val
        
        return self.hasPathSum(root.left, new_target) or \
               self.hasPathSum(root.right, new_target)
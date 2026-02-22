class Solution:
    def minDepth(self, root):
        # code here...
        # Base Case: If the tree is empty
        if not root:
            return 0
        
        # If the left child is missing, we must go down the right path
        if not root.left:
            return self.minDepth(root.right) + 1
        
        # If the right child is missing, we must go down the left path
        if not root.right:
            return self.minDepth(root.left) + 1
        
        # If both children exist, take the minimum of both paths
        return min(self.minDepth(root.left), self.minDepth(root.right)) + 1
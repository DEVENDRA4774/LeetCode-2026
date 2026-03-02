class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String currentPath, List<String> result) {
        currentPath += node.val;

        // If it's a leaf node, add the completed path
        if (node.left == null && node.right == null) {
            result.add(currentPath);
            return;
        }

        // Continue exploring if children exist
        if (node.left != null) {
            dfs(node.left, currentPath + "->", result);
        }
        if (node.right != null) {
            dfs(node.right, currentPath + "->", result);
        }
    }
}
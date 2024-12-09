/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        // Count paths including the current node
        int pathsFromRoot = countPaths(root, targetSum);

        // Recurse on the left and right subtree
        int pathsFromLeft = pathSum(root.left, targetSum);
        int pathsFromRight = pathSum(root.right, targetSum);

        // Total paths = paths including the root + paths in the left subtree + paths in the right subtree
        return pathsFromRoot + pathsFromLeft + pathsFromRight;
    }

    private int countPaths(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }

        int count = 0;

        // If the current node's value matches the remaining target sum, we found a path
        if (node.val == targetSum) {
            count++;
        }

        // Continue the path with the left and right child
        count += countPaths(node.left, targetSum - node.val);
        count += countPaths(node.right, targetSum - node.val);

        return count;
    }
}

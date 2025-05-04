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
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    // Traverse both trees simultaneously
    while (root1 != null && root2 != null) {
      // Check if both nodes are leaf nodes
      if (root1.left == null && root1.right == null && root2.left == null && root2.right == null) {
        // Compare the values of the leaf nodes
        return root1.val == root2.val;
      } 
      // If root1 is a leaf node but root2 is not, return false
      else if (root1.left == null && root1.right == null) {
        return false;
      } 
      // If root2 is a leaf node but root1 is not, return false
      else if (root2.left == null && root2.right == null) {
        return false;
      }
      // Move to the left child of root1 if it exists, otherwise move to the right child
      if (root1.left != null) {
        root1 = root1.left;
      } else {
        root1 = root1.right;
      }
      // Move to the left child of root2 if it exists, otherwise move to the right child
      if (root2.left != null) {
        root2 = root2.left;
      } else {
        root2 = root2.right;
      }
    }
    // If one of the trees is exhausted, return false
    return false;
  }
}
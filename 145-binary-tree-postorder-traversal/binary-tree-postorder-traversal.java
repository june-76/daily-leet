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
    public List<Integer> postorderTraversal(TreeNode root) {
        // 후위 순회
        // 왼쪽 서브 노드 -> 오른쪽 서브 노드 -> 루트 노드

        List<Integer> result = new ArrayList<>();

        postorderRecursion(root, result);

        return result;
    }

    public void postorderRecursion(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postorderRecursion(root.left, result);

        postorderRecursion(root.right, result);

        result.add(root.val);
    }
}
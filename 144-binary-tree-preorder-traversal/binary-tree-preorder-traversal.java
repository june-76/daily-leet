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
    public List<Integer> preorderTraversal(TreeNode root) {
        // 전위 순회
        // 루트 노드->왼쪽 서브 노드->오른쪽 서브 노드 순서로 탐색한다.
        // 모든 노드에서 탐색하는 방법이 동일하므로, 재귀 함수를 활용해보자.
        List<Integer> result = new ArrayList<>();

        preorderRecursion(root, result);

        return result;
    }

    public void preorderRecursion(TreeNode root, List<Integer> result) {
        // 현재 노드가 없을 경우 해당 함수 종료
        // 이 조건문이 노드 순회를 종료하는 기준이 된다.
        if (root == null) {
            return;
        }
    
        // 현재 노드의 값을 result에 추가
        result.add(root.val);

        // 왼쪽 서브 노드를 탐색하기
        preorderRecursion(root.left, result);

        // 오른쪽 서브 노드를 탐색하기
        preorderRecursion(root.right, result);
    }
}
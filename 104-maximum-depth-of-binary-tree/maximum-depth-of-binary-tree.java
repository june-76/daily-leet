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
    public int maxDepth(TreeNode root) {
        // 트리의 최대 깊이를 어떻게 알 수 있을까?
        // 전위, 중위, 후위 순회 모두 결국에는 '모든 노드를 방문해야' 종료되므로, 시간복잡도는 동일하다.
        // 적합한 순회 방법이 있겠지만... 먼저 전위 순회를 사용해보자.

        // 최대 깊이를 추적하는 변수 생성
        // int maxDepth = 0;
        int[] maxDepth = {0};
    
        inorderTraversal(root, 1, maxDepth);

        return maxDepth[0];
    }
    
    // 순회를 시작한 노드부터 순회가 종료된 노드의 깊이를 구하되,
    // 동일한 레벨의 경우에는 깊이로 계산하지 않아야 한다.
    public void inorderTraversal(TreeNode node, int currentDepth, int[] maxDepth) {
        if (node == null) {
            return;
        }

        // maxDepth를 불변하지 않게 수정했으므로(int -> int[])
        // 해당 함수에서 return하지 않고, maxDepth를 직접 수정하면 된다.
        
        // 현재 깊이가 최대 깊이보다 크다면 최대 깊이를 업데이트한다.
        // 최대 깊이를 업데이트하는 이 로직이 재귀함수의 마지막 부분이다!
        // 즉, 트리를 끝까지 탐색한 지점에서 최대 깊이를 반환하게 된다.
        maxDepth[0] = (maxDepth[0] > currentDepth) ? maxDepth[0] : currentDepth;

        // 왼쪽 서브 노드를 탐색하면서 현재 깊이를 1 증가시킨다.
        inorderTraversal(node.left, currentDepth + 1, maxDepth);

        // 오른쪽 서브 노드를 탐색하면서 현재 깊이를 1 증가시킨다.
        inorderTraversal(node.right, currentDepth + 1, maxDepth);
    }
}
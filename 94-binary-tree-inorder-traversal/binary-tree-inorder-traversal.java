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
    public List<Integer> inorderTraversal(TreeNode root) {
        // 중위 순회
        // (존재한다면)왼쪽 서브 노드->루트 노드->오른쪽 서브 노드 순서로 탐색한다.

        List<Integer> result = new ArrayList<>();

        // 가장 먼저 현재 위치를 확인하고,
        // 현재 위치에서 왼쪽 서브 노드가 있는 지 확인하는 동작이 반복된다.
        // 이 동작은 더 이상 탐색할 노드가 없을 때까지 동일하게 반복되므로, 재귀 함수를 사용해보자.
        recursionTree(root, result);

        /*
        // root 노드가 없는 경우도 있으므로 확인(Example 3)
        if (root != null) {
            // 객체의 객체의 메모리 주소가 아닌 객체의 값(필드 val의 값)에 접근해야 한다.
            System.out.println("현재 노드 값: " + root.val);

            if (root.left != null) {
                System.out.println("왼쪽 자식 노드 값: " + root.left.val);
                if (root.left.left != null) {
                    System.out.println("왼쪽 자식 노드의 왼쪽 자식 노드 값: " + root.left.left.val);
                    // 이 형태를 반복하려면...
                    // 트리를 반복 순회 -> 재귀 함수 호출
                } else {
                    System.out.println("왼쪽 자식 노드의 왼쪽 자식 노드가 없습니다.");
                }
            } else {
                System.out.println("왼쪽 자식 노드가 없습니다.");
            }

            if (root.right != null) {
                System.out.println("오른쪽 자식 노드 값: " + root.right.val);
            }else {
                System.out.println("오른쪽 자식 노드가 없습니다.");
            }
        } else {
            // 빈 리스트 반환(Example 3)
            System.out.println("루트 노드가 없습니다.");
        }
        */

        return result;
    }

    // result의 요소를 직접 변경하므로(add) 본 함수에서는 객체를 반환할 필요가 없다.
    public void recursionTree(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // 왼쪽 서브 노드(트리) 탐색
        recursionTree(root.left, result);
        
        // 현재 노드 값을 결과 리스트에 저장(최종적으로 반환되는 리스트)
        result.add(root.val);
        
        // 오른쪽 서브 노드(트리) 탐색
        recursionTree(root.right, result);
    }
}
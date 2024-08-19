# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        # 주어진 값과 동일한 값을 가진 노드와 그 노드의 서브 노드를 반환하기
        
        # 이진트리 탐색 시 필수!!
        # 현재 노드가 None이면 탐색 종료
        if root is None:
            return None
        
        # 주어진 값과 노드이 값이 동일하면 해당 노드를 반환
        if root.val == val:
            return root
        
        # 현재 노드의 값이 찾고자 하는 값보다 작으면 오른쪽 서브트리에서 검색
        if root.val < val:
            return self.searchBST(root.right, val)
        
        # 현재 노드의 값이 찾고자 하는 값보다 크면 왼쪽 서브트리에서 검색
        return self.searchBST(root.left, val)
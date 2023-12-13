# Definition for a binary tree node.
from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def orderTraversal(self, root: Optional[TreeNode]) -> List[int]:

        res = []

        def inorder(root):
            if not root:
                return
            
            inorder(root.left)
            res.append(root.val)
            inorder(root.right)
        
        def preorder(root):
            if not root:
                return
            
            res.append(root.val)
            preorder(root.left)
            preorder(root.right)        

        def postorder(root):
            if not root:
                return
            
            postorder(root.left)
            postorder(root.right)
            res.append(root.val)
        
        postorder(root)
        return res
                
if __name__ == "__main__":
    sol = Solution
    node = sol.createTree
    print(sol.inorderTraversal(sol, node))
            
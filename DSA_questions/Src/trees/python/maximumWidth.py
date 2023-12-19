import collections


class TreeNode:
    def __init__(self, data) -> None:
        self.data = data
        self.left = None
        self.right = None
        
def maximumWidth(root: TreeNode):
    
    dqueue = collections.deque()
    dqueue.append((root, 0))
    mpp = collections.OrderedDict()
    res = []
    while dqueue:
        node, level = dqueue.popleft()
        if not node:
            continue
        mpp[level] = node.data
        dqueue.append((node.left, level-1))
        dqueue.append((node.right, level+1))
        
    for v in sorted(mpp.keys()):
        res.append(mpp[v])
    
    
    return res[len(res)-1] - res[0]

def createTree() -> TreeNode:
        
        node1 = TreeNode(50)
        node2 = TreeNode(20)
        node3 = TreeNode(45)
        node4 = TreeNode(11)
        node5 = TreeNode(15)
        node6 = TreeNode(30)
        node7 = TreeNode(78)
        node8 = TreeNode(8)

        node1.leftChild = node2
        node1.rightChild = node3
        node2.leftChild = node4
        node2.rightChild = node5
        node3.leftChild = node6
        node3.rightChild = node7
        node6.leftChild = node8
        return node1
    
if __name__ == "__main__":
    root = createTree()
    print(maximumWidth(root))
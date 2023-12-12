
class BinaryTreeNode:
    def __init__(self, data) -> None:
        self.data = data
        self.leftChild = None
        self.rightChild = None

class HeightOfTree:
                    
    def calHeighOfTree(self, node : BinaryTreeNode)->int:
        if(node == None):
            return 0
        else:
            ldepth = self.calHeighOfTree(self, node.leftChild)
            rdepth = self.calHeighOfTree(self, node.rightChild)
            
            if(ldepth > rdepth):
                return ldepth + 1
            else:
                return rdepth + 1
            
    
    def createTree() -> BinaryTreeNode:
        
        node1 = BinaryTreeNode(50)
        node2 = BinaryTreeNode(20)
        node3 = BinaryTreeNode(45)
        node4 = BinaryTreeNode(11)
        node5 = BinaryTreeNode(15)
        node6 = BinaryTreeNode(30)
        node7 = BinaryTreeNode(78)

        node1.leftChild = node2
        node1.rightChild = node3
        node2.leftChild = node4
        node2.rightChild = node5
        node3.leftChild = node6
        node3.rightChild = node7
        return node1
    
if __name__ == "__main__":
        
    heightOfTree = HeightOfTree
    root = heightOfTree.createTree()
    print(heightOfTree.calHeighOfTree(heightOfTree, root))
    
    
    
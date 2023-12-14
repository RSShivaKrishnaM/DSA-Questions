
class TreeNode:
    def __init__(self, data) -> None:
        self.data = data
        self.leftChild = None
        self.rightChild = None
        self.hd = None
        
def leftView(node: TreeNode, level : int, ds:[]):
    if(node == None):
        return 
    if(level == len(ds)):
        ds.append(node)
    leftView(node.leftChild, level+1, ds)
    leftView(node.rightChild, level+1, ds)

def rightView(node: TreeNode, level: int, ds:[]):
    if(node == None):
        return 
    if(level == len(ds)):
        ds.append(node)
    rightView(node.rightChild, level+1, ds)
    rightView(node.leftChild, level+1, ds)
    
def bottomView(node: TreeNode, ans:[]):
    
    if(node == None):
        return
      
    hdToData = {}
    node.hd = 0
    q =[node]
    
    while(len(q)!=0):
        temp = q.pop(0)
        hd = temp.hd
        hdToData[hd] = temp
        if(temp.leftChild!= None):
            temp.leftChild.hd = hd - 1
            q.append(temp.leftChild)
        if(temp.rightChild!=None):
            temp.rightChild.hd = hd + 1
            q.append(temp.rightChild)
    
    # hdToData.items
    for entry in hdToData:
        ans.append(hdToData[entry].data)
        
        
            
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
    ds = []
    # rightView(root, 0, ds)
    # for d in ds:
    #     print(d.data)
    
    ds_1 = []
    # leftView(root, 0, ds_1)
    # for d in ds_1:
    #     print(d.data)
        
    ds_2 = []
    bottomView(root, ds_2)
    for d in ds_2:
        print(d)
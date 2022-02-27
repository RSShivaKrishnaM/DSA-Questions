package trees;

public class DiameterOfTree {

//	public DiameterOfTree(DiameterOfTree.TreeNode root) {
//		super();
//		this.root = root;
//	}

//	Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
   public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
   
        int[] ans = dfs(root);
   
        return ans[0];
   }

  public int[] dfs(TreeNode root){
       if(root == null){
           return new int[]{0,-1};
       }
   
       int[] lDia = dfs(root.left);
       int[] rDia = dfs(root.right);

       int[] diaH = new int[2];
   
       diaH[0] = Math.max(Math.max(lDia[0] ,rDia[0]), lDia[1] + rDia[1] + 2);
       diaH[1] = Math.max(lDia[1],rDia[1]) + 1;
   
       return diaH;
   }
  
  private TreeNode root;
  
   public static void main(String[] args) {
	   DiameterOfTree diam = new DiameterOfTree();
	   
	   
	   
//       int arr[] = {4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2 };
       diam.root = diam.insertLevelOrder(arr, diam.root, 0);
       diam.inOrder(diam.root);
       
       System.out.println("Diameter : "+diam.diameterOfBinaryTree(diam.root));
       
   }
   
   // Function to insert nodes in level order
   public TreeNode insertLevelOrder(int[] arr, TreeNode root,
                                               int i)
   {
       // Base case for recursion
       if (i < arr.length) {
           TreeNode temp = new TreeNode(arr[i]);
           root = temp;

           // insert left child
           root.left = insertLevelOrder(arr, root.left,
                                            2 * i + 1);

           // insert right child
           root.right = insertLevelOrder(arr, root.right,
                                              2 * i + 2);
       }
       return root;
   }

   // Function to print tree nodes in InOrder fashion
   public void inOrder(TreeNode root)
   {
       if (root != null) {
           inOrder(root.left);
           System.out.print(root.val + " ");
           inOrder(root.right);
       }
   }
}

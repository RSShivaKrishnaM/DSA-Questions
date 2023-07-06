package trees.traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderTraversal {
	
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
	  public List<Integer> preorderTraversal1(TreeNode root) {
	        // insert root to list and stack
	        // insert left to list  and stack
	        // insert right to list
	        List<Integer> res = new ArrayList<>();
	        Stack<TreeNode> stack = new Stack<>();
	        TreeNode temp = root;
	        while(true){
	           while(temp!=null){
	               stack.push(temp);
	               res.add(temp.val);
	               temp = temp.left;
	           }
	           if(stack.isEmpty()){
	               break;
	           } 
	           temp = stack.pop().right; 
	        }
	        return res;
	    }
	    
	    public List<Integer> preorderTraversal(TreeNode root){
	        List<Integer> res = new ArrayList<>();
	        preOrder(res, root);
	        return res;
	    }
	    
	    public void preOrder(List<Integer> res, TreeNode root){
	         if(root==null){
	            return;
	        }
	        res.add(root.val);
	        preOrder(res,root.left);
	        preOrder(res,root.right);
	    }
	  
}

package trees.traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import trees.traversals.BinaryTreePreOrderTraversal.TreeNode;

public class BinaryTreeLevelOrderTraversal {
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

	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> res = new ArrayList<>();
	        List<Integer> level = new ArrayList<>();
	       
	        Queue<TreeNode> q = new LinkedList<>();
	        if(root==null){
	            return res;
	        }
	        
	        level.add(root.val);
	        res.add(level);
	        q.add(root);
	        TreeNode temp;
	        while(!q.isEmpty()){
	            level = new ArrayList<>();
	            temp = q.poll();
	            System.out.println(temp.val);
	            if(temp.left!=null){
	                q.add(temp.left);
	                level.add(temp.left.val);
	            }
	            if(temp.right!=null){
	                q.add(temp.right);
	                level.add(temp.right.val);
	            }
	            if(!level.isEmpty())
	                res.add(level);
	        }
	     return res;   
	    }
}

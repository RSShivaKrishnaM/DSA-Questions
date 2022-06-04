package arrays.kadensAlgo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class WalMartTest2 {
/*
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

       		 3
  		9         20
	  1   2    15      7
    4   8 
 -2  -1

3, 20, 9, 1, 2, 15, 7, 8, 4, -2, -1 


Output: [[3],[20,9],[15,7]]
 */
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	public List<List<Integer>> zigZag(TreeNode root){
		List<List<Integer>> res = new ArrayList<>();
	
		if(root==null) {
			return res;
		}
        TreeNode temp = root;
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		int count = 0;
		while(!queue.isEmpty()) {
		
			if(count%2==0) {
				if(temp.right!=null) {
					queue.add(temp.left);
				}
				if(temp.left!=null) {
					queue.add(temp.right);
				}
			   
			}else {
				if(temp.left!=null) {
					queue.add(temp.left);
				}
				if(temp.right!=null) {
					queue.add(temp.right);
				}
			}

			Stack<TreeNode> stack = new Stack<>();
			while(queue.peek().val!=temp.val) {
				stack.add(queue.remove());
			}
			temp = stack.pop();
			count++;
		}
		
		return res;
	}
}

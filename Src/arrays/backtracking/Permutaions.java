package arrays.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutaions {
	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> res = new ArrayList<>();
	        dfs(nums, new ArrayList<>(), res);
	        return res;
	    }
	    
	    public void dfs (int[] nums, List<Integer> path, List<List<Integer>> res) {
	        if (path.size() == nums.length) {
	            res.add(new ArrayList<>(path));
	        }
	        

	        for (int i = 0; i < nums.length; i++) {
	            if (path.contains(nums[i])) {
	                continue;
	            }
	            path.add(nums[i]);
	            dfs(nums, path, res);
	            path.remove(path.size() - 1);
	        }
	    }
	    
	    public static void main(String[] args) {
	    	Permutaions perm = new Permutaions();
	    	int[] nums = new int[] {1,2,3};
	    	System.out.println(perm.permute(nums));
	    }
}

package arrays.kadensAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WalmarTest1 {
/*
 * You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1

Set<(0,1),(1,1)>
Input: grid = [
[2,1,1],
[1,1,0],
[0,1,1]]
Output: 4

[2,2,1],
[2,1,0],
[0,1,1]

[2,2,2],
[2,2,0],
[0,1,1]

[2,2,2],
[2,2,0],
[0,2,1]

[2,2,2],
[2,2,0],
[0,2,2]
 */
	
	public int timeForAllRotten(int[][] mat) {
		 
	 int time = 0;
	 
	 List<Node> ones = new ArrayList<>();
	 List<Node> twos = new ArrayList<>();
	 for(int i = 0; i< mat.length; i++) {
		 for(int j = 0; j< mat[0].length; j++) {
			 if(mat[i][j]==1) {
				 ones.add(new Node(mat[i][j], i , j));
			 }else if(mat[i][j]==2) {
				 twos.add(new Node(mat[i][j], i , j));
			 }
		 }
	 }
	    

	  return time;	
	}

	private int dist(Node node1, Node node2) {
		int res =0;
		Math.pow(node1.x - node2.x,2);
		Map<Integer,Integer> map = new HashMap<>();
		map.computeIfPresent(1, (key,val)->val+1);
		return res ;
		
	}
	
	public static void sortColors(int[] nums) {
		Map<Integer, Integer> map = new TreeMap<>();

		Arrays.stream(nums).forEach(num -> {
			map.computeIfPresent(num, (key, val) -> val + 1);
			map.putIfAbsent(num, 1);
		});

		map.entrySet().stream().forEach(entry -> {
			int ind = 0;
			int key = entry.getKey();
			for (int i = 0; i < entry.getValue(); i++) {
				nums[ind] = key;
				ind++;
			}
		});
//		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
	}

	class Node{
		Node(int x, int y, int val){
			this.x = x;
			this.y = y;
			this.val = val;
		}
		int x;
		int y;
		int val;
	}

	public static void main(String[] args) {
		sortColors(new int[] {2,0,1,2,0,1});
	}

	
}

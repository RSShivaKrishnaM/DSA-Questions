//1 2 3
//4 5 6
//7 8 9
//n = 3
//m = 3

//1->2->3->6->9
//1->4->7->8->9

package trees.traversals;

import java.util.ArrayList;
import java.util.List;

public class OracleTest1 {

	static int row = 0;
	static int col = 0;
	static List<Integer> path = new ArrayList<>();

	static void findPath(int[][] mat, int ele, int ele2) {
		
		int m = mat.length;
		int n = mat[0].length;

		if (m - 1 == row && n - 1 == col) {
			System.out.println(path.toString());
		}
		
		path.add(ele2);
		if (col < n-1) {
			// right
			findPath(mat, mat[row][col], mat[row][++col]);
			// 1, 2
			
		}

		if (row < m-1) {
			// down side
			findPath(mat, mat[row][col], mat[++row][col]);
			//1, 3
		}
		path.remove(ele2);

	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		findPath(mat, 0, 0);
		//1, 2
	}

}

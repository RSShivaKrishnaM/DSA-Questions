package arrays.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {

		if (nums == null) {
			return null;
		}

		List<List<Integer>> res = new ArrayList<>();

		Arrays.sort(nums);
		int i = 0;
		for (i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				findTwoSum(nums, i + 1, nums.length - 1, nums[i] * -1, res);
			}
		}

		return res;
	}

	private static void findTwoSum(int[] nums, int low, int high, int target, List<List<Integer>> res) {
		while (low < high) {
			if (nums[low] + nums[high] < target) {
				low++;
			} else if (nums[low] + nums[high] > target) {
				high--;
			} else {
				res.add(Arrays.asList(nums[low], nums[high], target * -1));
				while (low < high && nums[low] == nums[low + 1])
					low++;
				while (low < high && nums[high] == nums[high - 1])
					high--;
				low++;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
		System.out.println(threeSum(new int[] {0,0,0,0}));
		System.out.println(threeSum(new int[] { -2, 0, 1, 1, 2 }));
	}
}

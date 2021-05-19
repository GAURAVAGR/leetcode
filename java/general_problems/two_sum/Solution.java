package general_problems.two_sum;

import java.util.HashMap;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> complimentList = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; ++i) {
			if (complimentList.containsKey(target - nums[i])) {
				return new int[] { complimentList.get(target - nums[i]), i };
			} else
				complimentList.put(nums[i], i);
		}
		return new int[] {};
	}
}

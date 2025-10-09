package com.dsa.array;

public class MaximumSubarray {

	public static void main(String[] args) {

		int[] nums = { 5,4,-1,7,8 };
		int maxSum = maxSubArray(nums);
		System.out.println(maxSum);
	}

	public static int maxSubArray(int[] nums) {

		// initialization
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for(int i=0;i<nums.length;i++)
		{
			// [i] index into sum
			sum = sum + nums[i];

			// sum greater then move into max
			if(sum > max)
			{
				max = sum;
			}

			// sum < 0 then sum 0
			if(sum < 0)
			{
				sum = 0;
			}
		}

		return max;
	}

}

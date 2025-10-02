package com.dsa.array;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums= {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
		
	}

	public static int missingNumber(int[] nums) {
		
		int sum = 0;

		// 0 to length
		for(int i=0;i<nums.length;i++)
		{
			// sum of array assigning into sum
			sum = sum + nums[i];
		}

		// actual sum formula N*(N+1)/2
		int actualSum = (nums.length*(nums.length+1))/2;
		// sub actualSum - sum
		int missingNum = actualSum - sum ;
		
		return missingNum;
	}
}

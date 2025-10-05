package com.dsa.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) 
	{
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println(Arrays.toString(rotate(nums, k)));
	}
	
	public static int[] rotate(int[] nums, int k)
	{
		// accepting length
		int n = nums.length;
		// 	if k value is greater then apply
		k = k % n;
		// calling method 3 times : method overloading 
		reverse(nums,0,n-1);		// to reverse array
		reverse(nums,0,k-1);		// reverse till k value
		reverse(nums,k,n-1);		// reverse remaining
		
		return nums;
	}

	private static void reverse(int[] nums, int start, int end) {
		
		while(start<=end)
		{
			// rotate logic
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}

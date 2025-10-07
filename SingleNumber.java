package com.dsa.array;

public class SingleNumber {

	public static void main(String[] args) {
		
		int[] nums = { 1 };
		System.out.println(singleNumber(nums));
		
	}

	public static int singleNumber(int[] nums) {
		
		// XOR   initialized with 0
		int XOR = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			// using bit manipulation : if same then it gives 0 or it's single then return no
			XOR = XOR ^ nums[i];
		}
		
		return XOR;
	}
}

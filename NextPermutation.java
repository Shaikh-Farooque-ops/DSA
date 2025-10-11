package com.dsa.array;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] nums = {1,1,5};
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums)); 
	}

	public static void nextPermutation(int[] nums) {

		// initialization
		int index = -1;

		// smallest element find
		for(int i=nums.length-2;i>=0;i--)
		{
			if(nums[i] < nums[i+1])
			{
				index = i;
				break;
			}
		}

		// if not element found smaller
		if(index==-1)
		{
			reverse(nums,0,nums.length-1);
			return;
		}

		// finding next element which is greater than index
		for(int i=nums.length-1;i>index;i--)
		{
			if(nums[i] > nums[index])
			{
				swap(nums,i,index);
				break;
			}
		}

		// sort/reverse
		reverse(nums,index+1,nums.length-1);
	}

	// Helper ()
	public static void reverse(int[] nums,int start,int end)
	{
		while(start < end)
		{
			swap(nums,start++,end--);
		}
	}

	// Helper ()
	public static void swap(int[] nums,int i ,int j)
	{
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}

package com.dsa.array;

public class RemoveDuplicatesTwoPointer {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums)
	{
		int i=0;
		for(int j=1;j<nums.length;j++)
		{
			// if j is unique with i then proceed
			if(nums[j]!=nums[i])		
			{
				// placed j +1 index of i
				nums[i+1]=nums[j];
				// moving also to store
				i++;
			}
		}

		// i index is 1 but the size is 2 so increment+1
		return i+1;

	}
}

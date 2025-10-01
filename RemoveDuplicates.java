package com.dsa.array;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
		
	}
	
	// static method to remove duplicate
	public static int removeDuplicates(int[] nums)
	{
		int count=0;
		
		// from 0 to length-1 : if we go till end then index out of bound exception
		for(int i=0;i<nums.length;i++)
		{
			// if current element == next element	: continue
			if(i<nums.length-1 && nums[i]==nums[i+1])			
			{
				continue;
			}
			
			// if not then save in an array
			else
			{
				// put index value into count and then increment by 1 and return it
				nums[count]=nums[i];
				count++;
			}
		}
		
		return count;
	}

}

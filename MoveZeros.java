package com.dsa.array;

public class MoveZeros {

	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		int[] ans = moveZeroes(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(ans[i] + " ");
		}
		
		System.out.println(" ");
	}

	public static int[] moveZeroes(int[] nums)
	{
		// j index value
		int j=-1;
		
		// 0 to n
		for(int i=0;i<nums.length;i++)
		{
			// 0==0
			if(nums[i]==0)
			{
				// if 0 find then it is j
				j = i;
				break;
			}
		}
		
		// i=j+1 to n i++
		for(int i=j+1;i<nums.length;i++)
		{
			// if non-zero find then swap and j++s
			if(nums[i]!=0)
			{
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				j++;
			}
		}
		return nums;
	}
}

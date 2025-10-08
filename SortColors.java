package com.dsa.array;

public class SortColors {

	public static void main(String[] args) {
		
		int[] nums = { 2,0,1 };
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
	}

	public static void sortColors(int[] nums) {
		
		// initialization
        int low = 0;
		int mid = 0;
		int high = nums.length-1;
		
		while(mid<=high)
		{
            // mid == 0 : swap logic
			if(nums[mid]==0)
			{
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
			}
			
            // mid == 1 : swap logic
			else if(nums[mid]==1)
			{
				mid++;
			}
			
            // mid == 2 : swap logic
			else
			{
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
	}

}

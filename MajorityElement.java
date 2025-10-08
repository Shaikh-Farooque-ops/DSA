package com.dsa.array;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = { 2,2,1,1,1,2,2 };
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {

        // initialization
        int count = 0;
        int element = 0;

        for(int i=0;i<nums.length;i++)
        {
            // if count is 0: set as 1 and move to element
            if(count==0)
            {
                count=1;
                element = nums[i];
            }

            // if element match with array number ++
            else if(element == nums[i])
            {
                count++;
            }

            // if not --
            else
            {
                count--;
            }
        }

        // got element 
        // initialize with 0
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            // if element = array number ++ : final
            if(element == nums[i])
            {
                count1++;
            }
        }

        // count should be greater than N/2
        if(count1 > nums.length/2)
        {
            return element;
        }

        // if not find -1
        return -1;
    }

}

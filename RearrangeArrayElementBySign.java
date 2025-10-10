package com.dsa.array;

public class RearrangeArrayElementBySign {

	public static void main(String[] args) {

		int[] nums = { 3,1,-2,-5,2,-4 };
		int[] ans = rearrangeArray(nums);
        for (int n : ans) {
            System.out.print(n + " ");
        }
	}

	public static int[] rearrangeArray(int[] nums) {

        // taking new array : not disturb the original array
        int[] result = new int[nums.length];

        // initialization
        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int i=0;i<nums.length;i++)
        {
            // if number < 0 : move negativeIndex
            if(nums[i] < 0)
            {
                result[negativeIndex] = nums[i];
                negativeIndex = negativeIndex + 2;
            }

            // if number > 0 : move positiveIndex
            else
            {
                result[positiveIndex] = nums[i];
                positiveIndex = positiveIndex + 2;
            }
        }

        return result;
    }

}

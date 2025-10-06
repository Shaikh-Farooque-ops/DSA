package com.dsa.array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int nums[] = { 1,0,1,1,0,1 };
		int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		
		 // max count
        int maxi = 0;
        // normal count of 1 number 0
        int count = 0;

        for(int i=0;i<nums.length;i++)
        {
            // if 1 matches : count++ : 
            if(nums[i]==1)
            {
                count++;
                // pick large value between maxi and count
                maxi = Math.max(maxi,count);
            }

            // if not macthes
            else
            {
                count = 0;
            }
        }

        return maxi;
	}

}

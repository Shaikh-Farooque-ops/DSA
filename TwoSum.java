package com.dsa.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2,7,11,15 };
		System.out.println(Arrays.toString(twoSum(nums, 9))); 
	}

	public static int[] twoSum(int[] nums, int target) {
		
		// using HashMap
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
			// target - no : actual number
			int req_num = target - nums[i];
			
			// actual number contain in HM then return no:index
			if(hm.containsKey(req_num))
			{
				int[] arr = {hm.get(req_num),i};
				return arr;
			}
				
			// if not in HM just add
			hm.put(nums[i], i);
		}
		
		return null;
	}
}

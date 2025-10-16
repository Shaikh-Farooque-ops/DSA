package com.dsa.string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
	
		// sort
		Arrays.sort(strs);
		
		// common match between strs[0] : strs[-1]
		String s1 = strs[0];
		String s2 = strs[strs.length-1];
		
		int index = 0;
		while(index < s1.length())
		{
			 // if match : else break
			if(s1.charAt(index) == s2.charAt(index))
			{
				index++;
			}
			
			else
			{
				break;
			}
		}
		
		// return empty String if not found
		return index==0? "" : s1.substring(0,index);
	}
}

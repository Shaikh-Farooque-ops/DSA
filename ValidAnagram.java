package com.dsa.string;

public class ValidAnagram {

	public static void main(String[] args) {
		
		String s="anagram";
		String t="nagaram";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		
		// if length is not same return false
		if(s.length()!=t.length())
			return false;
		
		// [] to store char
		int[] count = new int[26];
		
		// - with ASCII values and increment
		for(char ch : s.toCharArray())
		{
			count[ch-97]++;
		}
		
		// decrement the value 
		for(char ch : t.toCharArray())
		{
			count[ch-97]--;
		}
		
		// if every value is not zero return false : else return true
		for(int val : count)
		{
			if(val!=0)
				return false;
		}
		
		return true;
	}

}

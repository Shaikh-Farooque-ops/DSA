package com.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
		
		String s = "paper";
		String t = "title";
		System.out.println(isIsomorphic(s, t)); 
	}

	public static boolean isIsomorphic(String s, String t) {
		
		// using HashMap 
		Map< Character, Character> map =new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			// one char from both
			char ss = s.charAt(i);
			char tt = t.charAt(i);
			
			// two condition : 1- if values not match if occur second time 2- key not contains but duplicate value contains 
			if( (map.containsKey(ss) && map.get(ss)!=tt) || (!map.containsKey(ss) && map.values().contains(tt)))
			{
				return false;
			}
			
			// store in map
			map.put(ss, tt);
			
		}
		
		return true;
	}
}

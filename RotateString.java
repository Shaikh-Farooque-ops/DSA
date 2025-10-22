package com.dsa.string;

public class RotateString {

	public static void main(String[] args) {

		String s = "abcde";
		String goal = "abced";
		System.out.println(rotateString(s, goal));

	}

	public static boolean rotateString(String s, String goal) {

		// if length is not equal return false
		if(s.length()!=goal.length())	
			return false;

		// s String repeat if goal String exist in s String it is roatate String
		return (s+s).contains(goal);
	}

}

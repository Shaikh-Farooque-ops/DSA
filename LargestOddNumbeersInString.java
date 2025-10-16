package com.dsa.string;

public class LargestOddNumbeersInString {

	public static void main(String[] args) {

		String num = "35427";
		System.out.println(largestOddNumber(num));
	}

	public static String largestOddNumber(String num) {
		
		// length calculate : last index
		int len = num.length()-1;
		
		while(len>=0)
		{
			// store the number - 0 : for store original number not ACSII value
			int d = num.charAt(len)-0;
			
			// if odd number found : return from 0 to len+1 substring
			if(d%2!=0)
			{
				return num.substring(0,len+1);
			}
			
			len--;
		}
		
		// if not found return empty string
		return "";
	}

}

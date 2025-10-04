package com.dsa.array;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		
		System.out.println(validPdm("A man, a plan, a canal: Panama"));
	}

	public static boolean validPdm(String s)
	{
		// converting lowerCase & remove alphanumeric
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		
		// i=0 & j=-1 last index
		int i=0;
		int j=s.length()-1;
		
		// run i<=j
		while(i<=j)
		{
			// if not match return false or return true : side by side increment and decrement
			if(s.charAt(i)!= s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}

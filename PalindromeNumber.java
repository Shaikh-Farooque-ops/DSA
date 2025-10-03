package com.dsa.array;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(palindrome(-121));
	}

	public static boolean palindrome(int x)
	{
		// store original no into duplicate
		int dup = x;
		// initialized with 0
		int revN = 0;
		// if equal to zero then stop
		while(x > 0)
		{
			// take lastDigit
			int lastDigit = x % 10;
			// getting last no and so on 
			revN = (revN*10)+lastDigit;
			// remove last element 
			x = x / 10;
		}

		// if matched Pal
		if(revN == dup)
		{
			return true;
		}
		return false;
	}
}

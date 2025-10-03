package com.dsa.array;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int x = -123;
		System.out.println(reverse(x));
	}
	
	public static int reverse(int x)
	{
        // initialized with 0
		int revN = 0;
        // if equal to zero then stop
		while(x != 0)
		{
            // take lastDigit
			int lastDigit = x % 10;
            // if revN > MAX or revN < MIN return 0
			if(revN > Integer.MAX_VALUE/10 || revN < Integer.MIN_VALUE/10)
			{
				return 0;
			}
            // getting last no and so on 
			revN = (revN*10)+lastDigit;
            // remove last element 
			x = x / 10;
		}
		return revN;			
	}
	
}

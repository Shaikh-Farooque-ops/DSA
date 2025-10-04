package com.dsa.array;

public class FibonacciNo {

	public static void main(String[] args) {
		System.out.println(fibonacci(4));
	}
	
	public static int fibonacci(int n)
	{
		// first start with 0 & 1
		int a=0;
		int b=1;
		
		// if n is 0 then return 0 or return 1 if 1 
		if(n==0)
			return 0;
		
		else if(n==1)
			return 1;
		
		// start with 2 with n number
		for(int i=2;i<=n;i++)
		{
			// adding first & second and swapping
			int c = a + b;
			a = b;
			b = c;
		}
		
		return b;
	}
}

package com.dsa.array;

public class RemoveElementsTwoPointer {

	public static void main(String[] args) {
		
		int[] num = {3,2,2,3};	
		int value= 3;
		System.out.println(removeElement(num, value));
	}
	
	public static int removeElement(int[] num, int value)
	{
		int i=0;
		
		for(int j=0;j<num.length;j++)
		{
			if(num[j]!=value)
			{
				i++;
				num[i] = num[j];
			}
		}
		
		return i;
	}
}

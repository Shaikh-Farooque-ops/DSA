package com.dsa.array;

public class RemoveElements {		
	
	public static void main(String[] args) {
		
		int[] num= {3,2,2,3};
		int value= 3;
		int result = removeElement(num, value);
		System.out.println(result);
	}
	
	// remove element method : with [] and value
	public static int removeElement(int[] num, int value)
	{
		int count=0;
		
		for(int i=0;i<num.length;i++)
		{
			// who are not same with value perform operation
			if(num[i]!=value)
			{
				num[count]=num[i];
				count++;
			}
		}
		
		return count;
	}

}

package com.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int[][] mat = {
						{1, 2, 3, 4},
		                {5, 6, 7, 8},
		                {9, 10, 11, 12},
                	  };
		
		List<Integer> ans = spiralOrder(mat);
		for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
	}

	public static List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> ans = new ArrayList<>();

		int n = matrix.length;			// column calculate
		int m = matrix[0].length;  		// row	calculate

		// Initialization
		int top=0, left=0, right=m-1, bottom=n-1;

		// all element should be traversed
		while(top<=bottom && left<=right)
		{
			// from moving left to right
			for(int i=left;i<=right;i++)
			{
				ans.add(matrix[top][i]);
			}

			top++;

			// from moving top to bottom
			for(int i=top;i<=bottom;i++)
			{
				ans.add(matrix[i][right]);
			}

			right--;

			// from moving right to left
			if(top<=bottom)
			{
				for(int i=right;i>=left;i--)
				{
					ans.add(matrix[bottom][i]);
				}

				bottom--;
			}
						
			// from moving bottom to top
			if(left<=right)
			{
				for(int i=bottom;i>=top;i--)
				{
					ans.add(matrix[i][left]);
				}
				
				left++;
			}

		}

		return ans;
	}
}

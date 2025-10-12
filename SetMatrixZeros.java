package com.dsa.array;

public class SetMatrixZeros {

	public static void main(String[] args) {
		
		int[][] matrix = {
	            {1, 1, 1},
	            {1, 0, 1},
	            {1, 1, 1}
	        };
		
		setZeroes(matrix);
		
		for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
		
	}

	public static void setZeroes(int[][] matrix) {

		// initialization for fr & fc
		boolean fr=false;
		boolean fc=false;
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				// actual 0 found
				if(matrix[i][j]==0)
				{
					if(i==0)
					{
						fr=true;
					}
					
					if(j==0)
					{
						fc=true;
					}
					
					// first element of fr and fc is 0
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		
		// based on fr & fc element all others will be marked as 0
		for(int i=1;i<matrix.length;i++)
		{
			for(int j=1;j<matrix[0].length;j++)
			{
				if(matrix[i][0]==0 || matrix[0][j]==0)
				{
					matrix[i][j]=0;
				}
			}
		}
		
		if(fr)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				matrix[0][j]=0;
			}
		}
		
		if(fc)
		{
			for(int i=0;i<matrix.length;i++)
			{
				matrix[i][0]=0;
			}
		}
		
	}

}

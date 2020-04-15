package com.quantum.javabasics;

public class NumberSourendedBySmallerNumberInMatrix {

	public void find(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=1;j<matrix[i].length-1;j++)
			{
				if(matrix[i][j-1]<matrix[i][j]&matrix[i][j+1]<matrix[i][j])
				{
					matrix[i][j]=0;
				}
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		NumberSourendedBySmallerNumberInMatrix obj = new NumberSourendedBySmallerNumberInMatrix();
		int[][] matrix= {{1,4,2},{2,3,4},{1,5,2}};
		obj.find(matrix);
	}
}

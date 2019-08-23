package com.quantum.javabasics;

public class DiagonalDifference {
	static int DiagonalDif()
	{   
		int i = 0;
		int j=0;
		int sum1 = 0;
		int sum2=0;
		int[][] arr=new int[3][3];
		arr [0][0] = 11;
		arr [0][1] = 2;
		arr [0][2] = 4;
		arr [1][0] = 6;
		arr [1][1] = 5;
		arr [1][2] = 6;
		arr [2][0] = 10;
		arr [2][1] = 8;
		arr [2][2] = -12;
		for ( i =0;i<3;i++)
		{
			for( j = 0;j<3;j++)
		 {
			if (i==j)
			{
				sum1= sum1+arr[i][j];
			}
		 }
		}System.out.println("Sum1 "+sum1);
		for ( i=2,j=0;(i>=0)&&(j<3);i--,j++) 
			
		{
				sum2=sum2+arr[i][j];
		
		
		}
			
		System.out.println("Sum2 "+sum2);
		int diff =sum1-sum2;
		
		return (Math.abs(diff) );
	}
	public static void main(String[] arg)
	{
		int[] arr = new int[5];
		int n = arr.length;
		
		int[][] arr1 = new int[3][5];
		int n1 = arr1.length;
		int n2 = arr1[0].length;
		
		System.out.println(n + ", " + n1 + ", " + n2);
		

	}

}

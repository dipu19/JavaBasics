package com.quantum.javabasics;

public class ConnectedCells {

	public void connected(int[][] matrix)
	{
		int length1 = matrix.length;
		int length2 = matrix[0].length;
		int count=0;
		for(int i=0;i<length1;i++)
		{
			for(int j=0;j<length2;j++)
			{
				if(i == 0 & j==0)
				{
					if(matrix[i][j]==1)
					{
						if(matrix[i][j+1] == 1)
						{
							count++;
						}
						if(matrix[i+1][j] == 1)
						{
							count++;
						}
						if(matrix[i+1][j+1] == 1)
						{
							count++;
						}
						
					}
				}
				if(i == 0 & j == length2-1)
				{
					if(matrix[i][j] == 1)
					{
						if(matrix[i][j-1] == 1)
						{
							count++;
						}
						if(matrix[i+1][j-1] == 1)
						{
							count++;
						}
						if(matrix[i+1][j] == 1)
						{
							count++;
						}
					}
				}
				if(i == length1-1 & j == 0)
				{
					if(matrix[i][j] == 1)
					{
					if(matrix[i-1][j] == 1)
					{
						count++;
					}
					if(matrix[i-1][j+1] == 1)
					{
						count++;
					}
					if(matrix[i][j+1] == 1)
					{
						count++;
					}
					}
				}
				if(i == length1-1 & j == length2-1)
				{
					if(matrix[i][j] == 1)
					{
					if(matrix[i-1][j] == 1)
					{
						count++;
					}
					if(matrix[i-1][j-1] == 1)
					{
						count++;
					}
					if(matrix[i][j-1] == 1)
					{
						count++;
					}
					}
				}if(i==0 & (j>0&j<length2-1))
				{
					if(matrix[i][j] == 1)
					{
						if(matrix[i][j-1] == 1)
						{
							count++;
						}
						if(matrix[i][j+1] ==1)
						{
							count++;
						}
						if(matrix[i+1][j-1]==1)
						{
							count++;
						}
						if(matrix[i+1][j+1] == 1)
						{
							count++;
						}
						if(matrix[i+1][j+1] == 1)
						{
							count++;
						}
					}
					
				}
				if((i>0&i<length1-1)& j==0)
				{
					if(matrix[i][j] == 1)
					{
						if(matrix[i-1][j] == 1)
						{
							count++;
						}
						if(matrix[i+1][j] == 1)
						{
							count++;
						}
						if(matrix[i-1][j+1] == 1)
						{
							count++;
						}
						if(matrix[i][j+1] == 1)
						{
							count++;
						}
						if(matrix[i+1][j+1] == 1)
						{
							count++;
						}
					}
				}
				if(i== length1&(j>0&j<length2-1))
				{
					if(matrix[i][j] == 1)
					{
						if(matrix[i][j-1] == 1)
						{
							count++;
						}
						if(matrix[i][j+1] == 1)
						{
							count++;
						}
						if(matrix[i-1][j-1]==1)
						{
							count++;
						}
						if(matrix[i-1][j] == 1)
						{
							count++;
						}
						if(matrix[i-1][j+1] == 1)
						{
							count++;
						}
					}
				}
				if ((i>0&i<length1-1)&j==length2)
				{
					if(matrix[i][j] == 1)
					{
						if(matrix[i+1][j] == 1)
						{
						 count++;	
						}
						if(matrix[i-1][j] == 1)
						{
							count++;
						}
						if(matrix[i-1][j-1]==1)
						{
							count++;
						}
						if(matrix[i][j-1]==1)
						{
							count++;
						}
						if(matrix[i+1][j-1]==1)
						{
							count++;
						}
					}
				}
				if((i>0&i<length1-1)&(j>0&j<length2-1))
				{
					if(matrix[i][j] == 1)
					{
						if(matrix[i][j-1]==1)
						{
							count++;
						}
						if(matrix[i][j+1]==1)
						{
							count++;
						}
						if(matrix[i-1][j-1]==1)
						{
							count++;
						}
						if(matrix[i-1][j]==1)
						{
							count++;
						}
						if(matrix[i-1][j+1]==1)
						{
							count++;
						}
						if(matrix[i+1][j-1] == 1)
						{
							count++;
						}
						if(matrix[i+1][j]==1)
						{
							count++;
						}
						if(matrix[i+1][j+1]==1)
						{
							count++;
						}
					}
				}
			}
		}System.out.println(count);

	}
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
		arr[0][0]= 0;
		arr[0][1]= 1;
		arr [0][2] =0;
		arr[1][0]= 1;
		arr[1][1]= 0;
		arr[1][2] = 0;
		arr[2][0] = 1;
		arr[2][1] = 0;
		arr[2][2] =1;		

		ConnectedCells obj = new ConnectedCells();
		obj.connected(arr);
	}
}

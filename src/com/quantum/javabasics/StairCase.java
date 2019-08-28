package com.quantum.javabasics;

public class StairCase {
	public static void main (String[] arg)
	{
	int n=5;
	
	 for (int i =1;i<=n;i++)
     {
         for(int j=1;j<=n-1;j++)
         
             System.out.print(" ");
         
         for(int k=1;k<=i;k++)
         {
             System.out.print("#");
            
         }
         System.out.println();
     }
	}

}

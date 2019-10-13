package com.quantum.javabasics;
import java.util.*;
public class SherlockAndBeast {
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 StringBuilder strb=new StringBuilder();
         for(int i=n;i>=0;i--)

         {   
             if(i%3==0 && (n-i)%5==0)
             {
                 int j=0;
                 for(j=0;j<i;j++)
                     strb.append("5");
                 for(int k=j;k<n;k++)
                     strb.append("3");
                 break;

             }
         }
         if(strb.length()==0)
             System.out.println("-1");
         else
             System.out.println(strb);
	}
}

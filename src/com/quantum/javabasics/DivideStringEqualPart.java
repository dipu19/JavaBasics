package com.quantum.javabasics;

import java.util.Scanner;

public class DivideStringEqualPart {

	public void divideString(String str,int parts)
	{
		int length=str.length();
		
		char[] arr=new char[length];
		if(length%parts==0)
		{   
			for(int i=0;i<length;i++)
			{
				arr[i]=str.charAt(i);
			}
			for(int i=0;i<length;i++)
			{
				if(i%parts==0&i>0)
				{
					System.out.println();
				}
				System.out.print(str.charAt(i));
				
			}
		}
		
		if(length%parts!=0)
			{
			System.out.println("String can not divide into equal parts  ");
			}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Enter the no of parts you want to do");
		int parts=sc.nextInt();
		DivideStringEqualPart dv=new DivideStringEqualPart();
		dv.divideString(str, parts);
		
	}
}

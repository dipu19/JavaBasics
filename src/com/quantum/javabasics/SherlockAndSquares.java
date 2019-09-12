package com.quantum.javabasics;
import java.util.Scanner;
public class SherlockAndSquares {
	public int method1(int a,int b)
	{
		  int count=0;
	        for(int i=a;i<b+1;i++)
	        {
	            double re=Math.sqrt(i);
	            if(i%re==0)
	            {
	                count++;
	            }
	            
	        }return count;

	}
	public static void main(String[] args)
	{
		System.out.println("Enter the start point");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the end point");
		int b=sc.nextInt();
		SherlockAndSquares a1=new SherlockAndSquares();
		System.out.println("Number of square nos ="+a1.method1(a, b));
		
	}
}

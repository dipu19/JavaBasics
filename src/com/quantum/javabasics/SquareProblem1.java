package com.quantum.javabasics;
import java.util.Scanner;
public class SquareProblem1 {
	public static void main(String[] args)
	{
		
		System.out.println("Enter Start Point ");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		System.out.println("Enter End Point");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<end+1;i++)
		{
			double re=Math.sqrt(i);
			if(i%re==0)
			{
				count++;
			}
			
		}System.out.println(count);
	}
}

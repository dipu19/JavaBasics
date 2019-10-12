package com.quantum.javabasics;
import java.util.*;
public class MarkAndToys {
	public static void main(String[] args)
	{
		System.out.println("Enter certain amount");
		Scanner sc=new Scanner(System.in);
		int am=sc.nextInt();
		System.out.println("Enter the size of price array");
		int si=sc.nextInt();
		System.out.println("Enter the price list of toys");
		int[] arr=new int [si];
		for(int i=0;i<si;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		int count=0;
		for(int i=0;i<si;i++)
		{
			sum=sum+arr[i];
			
			if(sum>am)
				break;
			count++;
		}System.out.println(count);
	}
}

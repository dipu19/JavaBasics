package com.quantum.javabasics;
import java.util.*;
public class ModifiedKeprakarNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower range");
		int p=sc.nextInt();
		System.out.println("Enter the upper range");
		int q=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=p;i<q;i++)
		{
			int square=i*i;
			 String str   = String.valueOf(square);
		        String left  = str.substring(0, str.length() / 2);
		        String right = str.substring(str.length() / 2);
		        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
		        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
		        if(numL+numR==i)
		        {
		        	al.add(i);
		        }
		}System.out.println(al);
	}
}

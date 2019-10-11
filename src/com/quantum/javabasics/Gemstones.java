package com.quantum.javabasics;
import java.util.*;
public class Gemstones {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array String");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter element to array");
		String[] s=new String[n];
		int result=0;
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		 for(char c='a'; c<='z';c++)
	        { int count=0;
	        for(int j=0; j<n;j++)
	            {
	            if(s[j].contains(Character.toString(c)))
	                {
	                count++;
	            }
	            else{
	                break;
	            }

	        }
	         if(count==n)
	             {
	             result++;
	         }
	    }
	    System.out.println(result);
	}
}

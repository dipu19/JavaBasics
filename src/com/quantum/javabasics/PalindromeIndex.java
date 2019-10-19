package com.quantum.javabasics;
import java.util.*;
public class PalindromeIndex {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0,j=s.length()-1;i<s.length()&j>=0;i++,j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}
		}if(count==s.length())
		{
			System.out.println(-1);
		}
		else
		{int number=0;
			for(int i=0,j=s.length()-1;i<s.length()&j>=0;i++,j--) {
				if(s.charAt(i)!=s.charAt(j))
				{
					if(s.charAt(i)==s.charAt(j-1))
					{
						number=j;
					}
					else {
						number=i;
					}
				}
			}System.out.println(number);
		}
		
	}
}

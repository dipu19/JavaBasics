package com.quantum.javabasics;

import java.util.Scanner;

public class RepeatCharacter {
	
	public void repeatCharacter(String str)
	{
		char[] arr=new char[str.length()];
		int repeat=0;
		char c=' ';
		for(int i=0;i<str.length();i++)
		{
			
				arr[i]=str.charAt(i);
			
		}
		for(int i=0;i<str.length();i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			
					for(int j=0;j<arr.length;j++)
					{
						if(arr[i]==arr[j])
						{
							count++;
						}
						
					}
					if(count>repeat)
					{
						repeat=count;
						c=str.charAt(i);
						System.out.println(str.charAt(i));
					}
			
		}System.out.println("Most repeated character is "+c);
	}
	public static void main(String[] args)
	{
		RepeatCharacter rc=new RepeatCharacter();
		System.out.println("Enter the text");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		rc.repeatCharacter(str);
	}
}

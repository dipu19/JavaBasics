package com.quantum.javabasics;

public class FirstNonRepeatedString {
	char a;
	public char repeat(String s)
	{
		int length=s.length();
		
		for(int i=0;i<length;i++)
		{
			int count=0;
			for(int j=i+1;j<length;j++)
			{
			if(s.charAt(i)!=s.charAt(j))
			{
				count++;
			}
			}
			if(count==length)
			{
				a=s.charAt(i);
			}
		}return a;
	}
	public static void main(String[] args)
	{
		FirstNonRepeatedString fn=new FirstNonRepeatedString();
		System.out.println(fn.repeat("dipu"));
	}
}

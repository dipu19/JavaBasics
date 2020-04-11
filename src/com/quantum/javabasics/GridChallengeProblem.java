package com.quantum.javabasics;

public class GridChallengeProblem {

	public void grid(String[] ar)
	{
		int count=0;
		int result = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(check(ar[i]))
			{
				count++;
			}
		}
		int size=ar[0].length();
		for(int i=0;i<ar.length;i++)
		{
			
			for(int j=0;j<size;j++)
			{   
				String s1="";
				for(int k=0;k<ar.length;k++)
				{
					s1=s1+ar[k].charAt(j);
				}
				if(check(s1))
				{
					result++;
				}
			}
			
		}
		
		if(result == (ar.length*ar[0].length())&count == ar.length)
		{
			System.out.println("Grid is possible");
		}
		else
		{
			System.out.println("Grid is not possible");
		}
	}
	public boolean check(String str)
	{
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			int count =0;
			for(int j=i+1;j<str.length();j++)
			{
			if(str.charAt(i) <= str.charAt(j))
			{
				count++;
			}
			}
			if(count == str.length()-1-i)
			{
				index++;
			}
			
			
			
		}
		
		if(index == str.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] arga)
	{
		GridChallengeProblem obj = new GridChallengeProblem();
	    String[] str= {"abc","def","gie"};
		obj.grid(str);
	}
}

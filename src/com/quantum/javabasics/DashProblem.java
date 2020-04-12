package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.List;

public class DashProblem {

	public void dashProblem(ArrayList<String> arr)
	{
		ArrayList <String>arr1 = new ArrayList<String>();
		for(int i=0;i<arr.size();i++)
		{
			if(check(arr.get(i)))
			{
				arr1.add("--");
			}
			else
			{
				arr1.add(arr.get(i));
			}
		}
		String str1="";
		for(int i=0;i<arr1.size();i++)
		{
			str1=str1+arr1.get(i);
		}
		System.out.println(str1);
	
		
	}
	public boolean check(String str)
	{
		int count1=0;
		for(int i=0;i<str.length();i++)
		{int count=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)<str.charAt(j))
				{
					count++;
				}
			}
			if(count==str.length()-1-i)
			{
				count1++;
			}
		}
		if(count1==str.length())
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		DashProblem obj = new DashProblem();
		ArrayList <String>arr = new ArrayList<String>();
		
		arr.add("ace");
		arr.add("you");
		
		arr.add("are");
		arr.add("good");
		arr.add("girl");
		arr.add("def");
		arr.add("stu");
		obj.dashProblem(arr);
		
		
		
	}
}

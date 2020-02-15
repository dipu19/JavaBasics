package com.quantum.javabasics;

public class NextGreaterString {

	public void greaterString(String s)
	{
		int length=s.length();
		char[] arr=new char[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=s.charAt(i);
		}
		int count=0;
		
	
		for(int i=1;i<length;i++)
		{
			
			for(int j=i+1;j<length;j++)
			
			{
				if(arr[length-i]>arr[length-j])
				{
					System.out.println(arr[length-1]+" "+arr[length-2]);
					char c=arr[length-i];
					arr[length-i]=arr[length-j];
					arr[length-j]=c;
					count++;
					
					
				}break;
			}break;
			
			
		}
		String s1="";
		if(count>0)
		{
		for(int i=0;i<arr.length;i++)
		{
			s1=s1+arr[i];
		}
		System.out.println("String is "+s1);
		}
		else
		{
			System.out.println("no answer");
		}
	}
	public static void main(String[] args)
	{
		NextGreaterString ngs=new NextGreaterString();
		ngs.greaterString("abcd");
	}
}

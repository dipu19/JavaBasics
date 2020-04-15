package com.quantum.javabasics;

public class ComparingStringArray {

	public void compare(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i].charAt(0)+"";
			for(int j=1;j<arr[i].length()-1;j++)
			{
				if(arr[i].charAt(j)>arr[i].charAt(j-1)&arr[i].charAt(j)>arr[i].charAt(j+1))
				{
					s=s+'X';
				}
				else
				{
					s=s+arr[i].charAt(j);
				}
			}
			s=s+arr[i].charAt(arr[i].length()-1);
			arr[i]=s;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		ComparingStringArray obj = new ComparingStringArray();
		String[] str= {"121","123","1564"};
		obj.compare(str);
	}
}

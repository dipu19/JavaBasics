package com.quantum.javabasics;

public class RotationOfCharacterFromString {

	public void rotate(String str,int k)
	{
		char[] arr=new char[str.length()];
		for (int i=0;i<str.length();i++)
		{
            arr[i] = str.charAt(i);		
		}
		
		for(int i=0;i<str.length();i++)
		{
			int ascii=(int)arr[i];
			//System.out.println(ascii);
			
			if(ascii>64&ascii<90||ascii>96&ascii<123)
			{
				int  chInt=arr[i]+k;
				
				char ch=(char)chInt;
				arr[i]=ch;
				 
				//System.out.println(str.charAt(i));
			}
		}String s="";
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
			
			
		}
		System.out.println(s);
		
	}
	public static void main(String[] args)
	{
		RotationOfCharacterFromString obj = new RotationOfCharacterFromString();
		obj.rotate("a-Little-boy", 3);
	}
			
}

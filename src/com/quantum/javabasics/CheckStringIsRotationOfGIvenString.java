package com.quantum.javabasics;

public class CheckStringIsRotationOfGIvenString {

	public void rotation(String string, String checkString)
	{
		int length = string.length();
		
		char[] charArray = string.toCharArray();
		
		for(int i=0;i<4;i++)
		{
			
			char ch = charArray[length-1];
			for(int j = length-1,k= j-1;j>=0&k>=0;j--,k--)
			{
              charArray[j] = charArray[k];
			}
			charArray[0] = ch;
			
			String str = "";
			
			for(int j =0;j<charArray.length;j++)
			{
				str = str+charArray[j];
			}
			
			if(str.equals(checkString))
			{
			  System.out.println("Yes the given string is rotation of original string");
			  break;
			}
			else 
			{
			if(i==length-1)
			{
				System.out.println("No the given string is not rotation of string");
			}
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		CheckStringIsRotationOfGIvenString obj = new CheckStringIsRotationOfGIvenString();
		
		String string = "1234";
		
		String checkString = "1232";
		
		obj.rotation(string,checkString);
	}
}

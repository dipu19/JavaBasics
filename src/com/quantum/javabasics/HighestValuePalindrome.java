package com.quantum.javabasics;

public class HighestValuePalindrome {
	
	public void highestValue(String s,int k )
	{
		int length = s.length();
		int count1 = 0;
		char [] charArray = s.toCharArray();
				
		for(int i=0,j=length-1;i<length&j>=0;i++,j--)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				count1++;
			}
		}
		if(count1/2 >k)
		{
			System.out.println("Can not calculate");
		}
		else
		{
			if(k%2 != 0)
			{
				int count  = 0;
				while(count<k-1)
				{
					for(int i=0,j=length-1;i<length&j>=0;i++,j--)
					{
						if(charArray[i] != charArray[j])
						{
							charArray[i] = '9';
							charArray[j] = '9';
							count = count+2;
						}
					}
				}
				if(count == k-1)
				{
					for(int i=0,j=length-1;i<length&j>=0;i++,j--)
					{
						if(charArray[i] != charArray[j])
						{
							
							charArray[j] = charArray[i] ;
						
						}
					}
				}
			}
		}
		String str ="";
		for(int i=0;i<charArray.length;i++)
		{
			str = str+charArray[i];
		}
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		HighestValuePalindrome obj = new HighestValuePalindrome();
		obj.highestValue("0011", 1);
	}
}

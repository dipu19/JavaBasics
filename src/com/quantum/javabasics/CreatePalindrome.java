package com.quantum.javabasics;

public class CreatePalindrome {

	public void create(String s1, String s2) throws InterruptedException
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					count++;
				}
			}
		}
		if(count<=1)
		{
			System.out.println("Palindrome is not possible");
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				String sub1 = (String)s1.subSequence(i,i+1);
				for(int j=0;j<s2.length();j++)
				{
					for(int m=j+1;m<s2.length();m++)
					{
					String sub2 = (String)s2.subSequence(j,m);
					String addString = sub1+sub2;
					int count1 = 0;
					for(int k=0,l=addString.length()-1;k<addString.length()&l>=0;k++,l--)
					{
						if(addString.charAt(k) == addString.charAt(l))
						{
							count1++;
						}
					}
					if(count1 == addString.length())
					{
						System.out.println("Palindrome String is : "+addString);
						Thread.sleep(1000);
					}
					}
				}
				
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		String s1= "Dipu";
		String s2="Sipu";
		CreatePalindrome  obj = new CreatePalindrome();
		obj.create(s1, s2);
	}
}

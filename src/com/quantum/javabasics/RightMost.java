package com.quantum.javabasics;

public class RightMost {
	public static void main(String[] args)
		{
			int n1=14;
			int n2=55;
			int n3=87;
			int i1=n1%10;
			int i2 =n2%10;
			int i3=n3%10;
			if (i1==i2)
			{
				System.out.println("true");
			}
			else if(i1 == i3)
			{
				System.out.println("true");
			}else if(i2==i3)
			{
				System.out.println("true");
			}
			else 
			{
				System.out.println("false");
			}
	}

}

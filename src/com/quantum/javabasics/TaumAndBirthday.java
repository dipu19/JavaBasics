package com.quantum.javabasics;
import java.util.*;
public class TaumAndBirthday {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of black gifts");
		int b=sc.nextInt();
		System.out.println("Enter the number of white gifts");
		int w=sc.nextInt();
		System.out.println("Enter the cost of white gift ");
		int wc=sc.nextInt();
		System.out.println("Enter the cost of black gifts");
		int bc=sc.nextInt();
		System.out.println("Enter the value of z");
		int z=sc.nextInt();
		int tc=0;
		if(bc>wc+z)
		{
			tc=b*(wc+z)+(w*wc);
		}
		else if(wc>bc+z)
		{
			tc=w*(bc+z)+(b*bc);
		}
		else {
			tc=w*wc+b*bc;
		}
		System.out.println("Total cost is "+tc);
	}
}

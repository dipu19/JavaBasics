package com.quantum.javabasics;
import java.util.*;
public class CompairingOfThirdNoWithSumOfTwoNos {
	 static boolean c;
	 static boolean ma()
	{
		 System.out.println("Enter the 1st number");
		 Scanner s1=new Scanner(System.in);
		 int number1 =s1.nextInt();
		 System.out.println("Enter the 2nd number");
		 Scanner s2=new Scanner(System.in);
		 int number2 =s2.nextInt();
		 System.out.println("Enter the 3rd number");
		 Scanner s3=new Scanner(System.in);
		 int number3 =s2.nextInt();
		if(number1+number2 ==number3)
		{
			 c = true;	
		}
		else {
			c=false;
		}return c;
		
	}public static void main(String[] args)
	{
		System.out.println(ma());
	}

}

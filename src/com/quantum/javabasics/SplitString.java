package com.quantum.javabasics;

import java.util.Scanner;

public class SplitString {
	
	public static void main(String[] args)
	{
		
		
		String strMain ="dipu is a good boy"; 
		String[] arrSplit_3 = strMain.split(" ",6);
		    for (int i=0; i < arrSplit_3.length; i++){
		      System.out.println(arrSplit_3[i]);
		    }
		  }
		
	
}

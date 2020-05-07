package com.quantum.javabasics;

public class Encryption {

	public void encrypt(String str)
	{
	   int length = str.length();
	   String s1="";
	   for(int i=0;i<length;i++)
	   {
		   if(str.charAt(i) != ' ' )
		   {
			   s1 = s1+str.charAt(i);
		   }
	   }
	   int length2 = s1.length();
	   int sqrt1 = (int)Math.sqrt(length2);
	   int sqrt =0;
	   int sqrt2 = 0;
	         if(sqrt1*(sqrt1+1)<length2)
			  {
                    sqrt = sqrt1+1;
                    sqrt2 = sqrt1+1;
			  }
	         else
	         {
	        	 sqrt = sqrt1;
	        	 sqrt2 = sqrt1+1;
	         }
		System.out.println(sqrt);		   
	   char [][] array = new char[sqrt][sqrt2];
	   int index=0;
	   for(int i=0;i<sqrt;i++)
	   {
		   for(int j=0;j<sqrt2;j++)
		   {
		   if(index<length2)
		   {
			   array[i][j] = s1.charAt(index);
			   index++;
		   }   
		   }
	   }System.out.println(s1);
	   
	  
		
		  for(int i=0;i<sqrt2;i++) { for(int j=0;j<sqrt;j++) {
		  System.out.print(array[j][i]); } System.out.print(" "); }
		 
	}
	public static void main(String[] args)
	{
		String s ="ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots";
		Encryption ec = new Encryption();
		ec.encrypt(s);
	}
}

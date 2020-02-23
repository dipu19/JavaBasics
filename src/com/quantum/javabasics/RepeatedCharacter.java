package com.quantum.javabasics;

public class RepeatedCharacter {
public static void main(String[] args)
{

{
	String s="ddrtddtyf";
	int n=10;
	 long countForSubString=0;
     long totalCount=0;
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)=='a')
         {
             countForSubString++;
         }
     }
      long divisor = n / s.length();

       

       totalCount += divisor * countForSubString;

       

       

       //Determines how many characters in we will analyze towards the end of our n range

       long remainder = n % s.length();

       

       for(int i = 0; i < remainder; i++)

       {

           if(s.charAt(i) == 'a')

           {

               totalCount++;

           }

       }
System.out.println(totalCount);
}     
}
}

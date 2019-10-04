package com.quantum.javabasics;
import java.util.*;
public class PasswordVerification {

	public static void main(String[] args) {
		
		String password="ae99kjdbfsdsb";
		int count1=0;
		
		int count=password.length();
        for(int i=0;i<password.length();i++)
        {
           for(int j=0;j<10;j++)
           {
        	   if(password.charAt(i)==j)
        	   {
        		   count1++;
        	   }
           }
        }
        for(int i=0;i<password.length();i++)
        {
           for(int j=97;j<97+25;j++)
           {
        	   if(password.charAt(i)==(char)j)
        	   {
        		   count1++;
        	   }
           }
        }
        for(int i=0;i<password.length();i++)
        {
           for(int j=65;j<65+25;j++)
           {
        	   if(password.charAt(i)==(char)j)
        	   {
        		   count1++;
        	   }
           }
        }if(password.length()>6)
        {
        	if(count1>6)
        	{
        		System.out.println("Strong passwword");
        	}
        }
        else
        {
        	System.out.println("password is not strong");
        }
	}

}

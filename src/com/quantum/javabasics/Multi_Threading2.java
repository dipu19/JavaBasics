package com.quantum.javabasics;
import java.util.*;
   class Multiplication1  extends Thread
   {
	   
	  
	   public void run()
	   {
		   for(int a=12,b=14;a<15&b<18;a++,b++)
		   {
		   int multiplication=a*b;
		   System.out .println("Multiplication is "+multiplication);
	   }
		   }
	   
   }
public class Multi_Threading2 {
  public static void main (String [] args) throws Exception
  {
	  Multiplication1 mc=new Multiplication1();
	  mc.start();
	  mc.sleep(5000);	  
	  for(int a=0,b=15;a<3&b<20;a++,b++)
	  {
	  System.out.println("Addition is "+(a+b));
	  
  }
  }
}

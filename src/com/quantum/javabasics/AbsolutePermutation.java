package com.quantum.javabasics;
import java.util.*;
public class AbsolutePermutation {
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter value of n");
	  int n=sc.nextInt();
	  System.out.println("Enter vlaue of l ");
	  int l=sc.nextInt();
	  int[] per = new int[n];
      int d = 1;
      for (int i = 0, j = 0; i < n; i++, j++) {
          if (j == l) {
              d *= -1;
              j = 0;
          }

          int value = i + 1 + l * d;
          if (value < 1 || value > n)
        	 
          per[i] = value;
      }
          for(int i=0;i<per.length;i++)
          {
        	  System.out.println(per[i]);
          }
      
  }
}

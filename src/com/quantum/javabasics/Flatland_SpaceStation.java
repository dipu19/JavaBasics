package com.quantum.javabasics;
import java.util.*;
public class Flatland_SpaceStation {
  public static void main(String[] args)
  {
	  System.out.println("Enter the number of cities");
	  Scanner sc =new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println("Enter the SpaceStation");
	  int m=sc.nextInt();
	  int distance=0;
	  int maxDistance=0;
	  
	  for(int i=1;i<=n;i++)
	  {
		  distance=Math.abs(i-m);
		  if(maxDistance<distance)
		  {
			  maxDistance=distance;
		  }
	  }System.out.println("Maximum Distance = "+maxDistance);
	  
  }
}

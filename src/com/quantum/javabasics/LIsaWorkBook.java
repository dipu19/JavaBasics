package com.quantum.javabasics;
import java.util.*;
public class LIsaWorkBook {
	public static void main(String[] args)
	{System.out.println("Enter the value of n");
	  Scanner sn = new Scanner(System.in);
	    int n = sn.nextInt();
	    System.out.println("enter the value of k");
	    int k = sn.nextInt();
	    int [] m = new int[n];
	    int j=2;int x=0; int y=0;
	    int count=0 ;
     System.out.println("Enter the value to array m");
	    for(int i=0 ; i<n ; i++){
	        m[i] = sn.nextInt();
	    }

	    for(int i=0 ; i<n ; i++){
	            
	            x = x+((j-2)/k)+1;
	            
	        for(j=1 ; j<=m[i] ; j++){
	            y = x+(j-1)/k;
	            if(j==y)
	                count++;
	        }
	    }
	    System.out.println(count);
	}
}

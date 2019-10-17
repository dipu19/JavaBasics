package com.quantum.javabasics;
import java.util.*;
public class PickingNumber {
	 public static void main(String[] args)
     { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
    	 ArrayList<Integer> l=new ArrayList<Integer>();
    	System.out.println("Enter value to arraylist");
    	
    	for(int i=0;i<n;i++)
    	{
    		l.add(sc.nextInt());
    	}
    	
         Collections.sort(l);

         int max =0;
         
         for ( int i=0;i<l.size();i++)
         {
             
             for ( int j=1;j<l.size();j++)
             {
              int diff=(Math.abs(l.get(i)-l.get(j))) ;
             if(diff>1)
                 break;
             
             int diffCount = j - i;
             if(diffCount > max) {
                 max = diffCount;
             }
             }
         }System.out.println(max+ 1);
     }
}

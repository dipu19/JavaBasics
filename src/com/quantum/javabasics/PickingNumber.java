package com.quantum.javabasics;
import java.util.*;
public class PickingNumber {
	 public static void main(String[] args)
     { 
    	 ArrayList<Integer> l=new ArrayList<Integer>();
    	 l.add(98);
    	 l.add(4);
    	 l.add(99);
    	 l.add(1);
    	 l.add(97);
    	 l.add(2);
    	
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

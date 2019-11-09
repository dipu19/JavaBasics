package com.quantum.javabasics;
import java.util.*;
public class MaximumPerimeterTriangle {
	public static void main(String[] args)
	{
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter the value of array size");
	int n=scanner.nextInt();
	int [] sticks=new int[n];
	for(int i=0;i<sticks.length;i++)
	{
		sticks[i]=scanner.nextInt();
	}
	 ArrayList <Integer>ar=new ArrayList<Integer>();
     int [] ar1=new int[ar.size()];
      Arrays.sort(sticks);
        int x, y, z;
        int count=0;
         for (int i = 0; i < sticks.length - 2; i++) {
            if (sticks[i] < sticks[i+1] + sticks[i+2]) {
                ar.add(sticks[i]);
                ar.add(sticks[i+1]);
                ar.add(sticks[i+2]);
                count++;
             
        }if(count==0) 
        {
            ar.add(-1);
        }
         }
        for(int i=0;i<ar1.length;i++)
        {
            ar1[i]=ar.get(i);
        }  
        System.out.println(ar);
    
        
    }
}

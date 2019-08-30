package com.quantum.javabasics;

public class CountingNoOfFruitsFall {
	static void m1()
	{   
		int count=0;
		int temp=0;
		int s=7;
		int t=10;
		int a=4;
	    int b=12;
	   
	    int[] distanceOfApplesFall= {5,5,-4};
	    int[] distanceOfOrangesFall= {3,-2,-4};
	    for(int i=0;i<distanceOfApplesFall.length;i++)
	    {
	    	distanceOfApplesFall[i]=a+distanceOfApplesFall[i];
	    	if(distanceOfApplesFall[i]>=s&&distanceOfApplesFall[i]<=t)
	    	{
	    		count++;
	    	}
	    	
	    }
	    for(int i=0;i<distanceOfOrangesFall.length;i++)
	    {
	    	distanceOfOrangesFall[i]=b+distanceOfOrangesFall[i];
	    	if(distanceOfOrangesFall[i]<=t&&distanceOfOrangesFall[i]>=s)
	    	{
	    		temp++;
	    	}
	    }
	    System.out.println(count);
    	System.out.println(temp);
	    	
	}
	public static void main(String[] args)
	{
		CountingNoOfFruitsFall.m1();
	}

}

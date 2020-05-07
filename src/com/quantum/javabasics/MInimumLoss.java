package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;

public class MInimumLoss {

	public int minLoss(long[] price)
	{
		int length = price.length;
		ArrayList <Long>ar = new ArrayList<Long>();
		for(int i=0;i<length;i++)
		{
			int min = 1000;
			for(int j = i+1;j<length;j++)
			{
				if(price[i]>price[j])
				{
					if(price[i]-price[j]<min)
					{
						long dif = price[i]-price[j];
						
						ar.add(dif);
					}
				}
			}
			
		}
		Collections.sort(ar);
		long result=ar.get(0);
		return (int)result;
		
	}
	public static void main(String[] args)
	{
		MInimumLoss min = new MInimumLoss();
		long [] arr = {20, 7, 8, 2 ,5};
		System.out.println(min.minLoss(arr));
	}
}

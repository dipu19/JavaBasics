package com.quantum.javabasics;

import java.util.Arrays;
import java.util.Collections;

public class PermutingTwoArrays {

	public void permute(Integer[] a, Integer[] b, int k)
	{
		int length1 = a.length;
		int length2 = b.length;
		int count=0;
		
		Arrays.sort(a);
		Arrays.sort(b,Collections.reverseOrder());
		if(length1 == length2)
		{
			for(int i=0;i<length1;i++)
			{
				if(a[i]+b[i]>=k)
				{
					count++;
				}
			}
		}
		if(count == length1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	public static void main(String[] args)
	{
		Integer[] a = {1,2,2,1};
		Integer[] b = {3,3,3,4};
		int k= 10;
		PermutingTwoArrays obj = new PermutingTwoArrays();
		obj.permute(a, b, k);
	}
}

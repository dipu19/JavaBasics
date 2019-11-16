package com.quantum.javabasics;
import java.util.*;
public class FlatLandAndSpaceStation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of cities");
		int n=sc.nextInt();
		System.out.println("Enter the cities having space-station");
		int m=sc.nextInt();
		int[] stations=new int[m];
		ArrayList ar=new ArrayList();
		for(int i=0;i<m;i++)
		{
			stations[i]=sc.nextInt();
		}
		for(int i=0;i<stations.length;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar.add(Math.abs(stations[i]-j));
			}
		}
		System.out.println(ar);
	}
}
